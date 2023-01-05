FROM alfresco/alfresco-search-services:2.0.5

USER root

#Install dumb-init
RUN wget https://github.com/Yelp/dumb-init/releases/download/v1.2.5/dumb-init_1.2.5_x86_64 -O /dumb-init && chown solr:solr /dumb-init && chmod +x /dumb-init

#Add entrypoint
COPY custom_entrypoint.sh /custom_entrypoint.sh
RUN chmod +x /custom_entrypoint.sh &&  chown solr:solr /custom_entrypoint.sh

USER solr

ARG ASS_HOME=/opt/alfresco-search-services
ARG SOLR_HOME=$ASS_HOME/solrhome

COPY log4j.properties $ASS_HOME/logs
COPY shared.properties $SOLR_HOME/conf

CMD ["/custom_entrypoint.sh"]