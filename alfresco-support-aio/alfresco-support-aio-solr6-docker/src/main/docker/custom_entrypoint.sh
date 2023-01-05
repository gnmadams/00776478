#!/dumb-init /bin/bash

SOLR_LOCK_FILE="$DIST_DIR/data/alfresco/index/write.lock"

shutdown(){
    echo "Shutting down solr..."
    PID=$(ps aux | grep -m2 "jar start.jar" | awk '{print $2}' | sed -n 1p)
    $DIST_DIR/solr/bin/solr stop -k solrrocks;
        #Wait until the SOLR is dead to continue
        echo "Checking to see if PID($PID) has shutdown"
        tail --pid=$PID -f /dev/null
        echo "SOLR Gracefully shutdown."
}


echo "################################################################################"
echo "## Running DAMS Customer Substituter file on the $DAMS_ENV environment."
echo "## ${project.artifactId} ([${buildTag}] ${buildTimestamp})"
echo "## Base image information: ${docker.solr6.image}:${alfresco.solr6.version}"
echo "################################################################################"
echo "... Starting SOLR using DAMS custom entrypoint."


echo "... Registering int/term traps."
trap shutdown int term

if [ -f "$SOLR_LOCK_FILE" ]; then
	echo "... Lock file found. Will remove lock file and continue startup since we are not running as a cluster.";
	yes | rm $SOLR_LOCK_FILE
fi

echo "... Calling alfresco's config setup file."
$DIST_DIR/solr/bin/search_config_setup.sh "exit;"

echo "Starting Alfresco SOLR6"
/bin/bash -c "$DIST_DIR/solr/bin/solr start $SOLR_OPTS"

#start container process for logging
sleep 5 && tail -f $DIST_DIR/logs/solr.log