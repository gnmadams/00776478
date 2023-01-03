package org.gnma.behavior;

import java.util.Arrays;
import java.util.List;

import org.alfresco.service.namespace.QName;

public class BehaviorConstants {
	// Namespaces
	protected static final String NAMESPACE_CM = "http://www.alfresco.org/model/content/1.0";
	protected static final String NAMESPACE_FMT_GNMA = "http://www.ginniemae.org/model/content/%s/1.0";

	// Subcontent Type
	protected static final int SUBCONTENTTYPE_DEPTH = 7; // This is the depth at which subcontent types exist.
															// ie:
															// /company_home/sites/ocm/documentLibrary/Structured_x0020_Solutions_x0020__x0028_REMIC_x0029_/REMIC_x0020_Closing_x0020_Documents/Closing_x0020_Flow_x0020_of_x0020_Funds_x0020_Instruction_x0020_Letter/

	// Top level types
	protected static final String TYPE_CM_CONTENT = "cm:content";
	protected static final String TYPE_DAMS_BASE_CONTENT = "damsBase:damsBaseDocument";
	protected static final String TYPE_GNMA_ROOT = "gnmaRoot:document"; // The single parent for all models
	// Gnma Public
	protected static final String TYPE_APM = "apm:ALL_PARTICIPANT_MEMOS";
	// ocm
	protected static final String TYPE_REMIC = "remiccd:REMIC_CLOSING_DOCUMENTS";
	// oipm
	protected static final String TYPE_SMF_ISSR_APP_DOC = "smfissrapp:smfIssuerApplicationDocuments";
	protected static final String TYPE_SMF_ISSR_APP_FILES = "smfissrfiles:smfIssuerFiles";
	protected static final String TYPE_SMF_ISSR_SUPP_FILES = "smfissrsupp:smfIssuerSupplementalFiles";
	protected static final String TYPE_SMF_ISSR_MISC_FILES = "smfissrmisc:smfIssuerMiscFiles";
	protected static final String TYPE_SMF_ISSR_FBI_COVERAGE = "smfissrefbic:smfIssuerEvidenceFbiCoverage";
	protected static final String TYPE_SMF_ISSR_COI_DOC = "smfissrcoi:smfIssuerCertOfInsurance";
	protected static final String TYPE_SMF_ISSR_EEO_COVERAGE = "smfissreeom:smfIssuerEvidenceOfErrorOmissions";
	protected static final String TYPE_SMF_ISSR_ORG_CHART_FAM_AFF = "smfissrorg:smfIssuerOrgCorpFamAffiliates";
	protected static final String TYPE_SMF_ISSR_APPLICANT_ORG_CHART = "smfissrapporg:smfIssuerApplicantOrgChart";
	protected static final String TYPE_SMF_ISSR_EXEC_SUBSERVICING = "smfissrexec:smfIssuerExecSubSvcAgreement";
	protected static final String TYPE_SMF_CONTRACT_DOC = "smfcondoc:smfContractDocuments";
	protected static final String TYPE_SMF_DEFAULTED_ISSR_DOC = "smfdefissr:smfDefaultedIssuerDocuments";
	protected static final String TYPE_SMF_ELECTRONIC_CONTRACT_DOC = "smfelectdoc:smfElectronicContractDocuments";
	protected static final String TYPE_SMF_ELECTRONIC_TFR_CONTRACT_DOC = "smfelectrans:smfElectronicTransferContractDocuments";
	protected static final String TYPE_SMF_ENTERPRISE_CORR = "smfentcorr:smfEnterpriseCorrespondence";
	protected static final String TYPE_SMF_FORMAL_REQUEST = "smfformreq:smfFormalRequest";
	protected static final String TYPE_SMF_HIST_CONTRACT_DOC = "smfhistcon:smfHistoricalContractDocuments";
	protected static final String TYPE_SMF_SCAN_CONTRACT_DOC = "smfscancon:smfScannedContractDocuments";
	protected static final String TYPE_SMF_SUPPLEMENTAL_DOC = "smfsuppdoc:smfSupplementalDocuments";
	protected static final String TYPE_SMF_TERMINATED_ISSR_DOC = "smftermissr:smfTerminatedIssuerDocuments";
	protected static final String TYPE_MANUFACTURED_HOMES_DOC = "mhdoc:mhDocuments";
	protected static final String TYPE_MONITORING_ASSET_MGT_DOC = "mamdoc:mamDocuments";
	// ocfo
	protected static final String TYPE_OCFO_TFR_CASH_RECEIPT_VOUCHER = "tfr:cashReceiptVoucher";
	protected static final String TYPE_OCFO_TFR_DISB_VOUCHER_GSA_CONTRACT = "tfr:disbursementVoucherGSAContract";
	protected static final String TYPE_OCFO_TFR_DISB_VOUCHER_NonGSA_CONTRACT = "tfr:disbursementVoucherNonGSAContract";
	protected static final String TYPE_OCFO_TFR_DISB_VOUCHER_MISCELLANEOUS = "tfr:disbursementVoucherMiscellaneous";
	
	
	protected static final String TYPE_OMO_AMD_ELR_HEARING = "elrd:hearing";
	protected static final String TYPE_OMO_AMD_ELR_COMPLAINT = "elrd:complaint";
	protected static final String TYPE_OMO_AMD_HR_SEPARATIONS = "amdhr:separations";
	protected static final String TYPE_OMO_AMD_HR_PERFORMANCE = "amdhr:performance";
	protected static final String TYPE_OMO_AMD_TRNG_MANDATORY_INCOMPASS = "amdtrng:mandatoryInCompass";
	protected static final String TYPE_OMO_AMD_TRNG_CONTINUING_EDUCATION = "amdtrng:continuingEducation";
	protected static final String TYPE_OMO_AMD_TRNG_CERTIFICATIONS = "amdtrng:certifications";
	protected static final String TYPE_OMO_AMD_TRNG_LEADERSHIP_DEVELOPMENT = "amdtrng:leadershipDevelopment";
	protected static final String TYPE_OMO_AMD_PERSONNEL_AWARDS = "amdp:awards";
	protected static final String TYPE_OMO_AMD_PERSONNEL_PROMOTIONS = "amdp:promotions";

	protected static final String TYPE_OMO_AMD_PERSONNEL_DETAILS = "amdp:details";
	protected static final String TYPE_OMO_AMD_PERSONNEL_REASSIGNMENTS = "amdp:reassignments";
	protected static final String TYPE_OMO_AMD_PERSONNEL_DISCIPLINARY_ACTIONS = "amdp:disciplinaryActions";

	protected static final String TYPE_OMO_AMD_SOP_TRAINING_REQUEST = "amds:trainingRequest";
	protected static final String TYPE_OMO_WIT_HCR_BIWEEKLY_REPORT = "withcr:biweeklyReport";
	protected static final String TYPE_OMO_WIT_FEVS_ANNUAL_FISCAL_YEAR = "witfevs:annualFiscalYear";
	protected static final String TYPE_OMO_WIT_GP_BIWEEKLY_EDITION = "witgp:biweeklyEdition";

	protected static final String TYPE_OMO_WIT_OMOS_ANNUAL_PERFORMANCE_REPORTS = "witomos:annualPerformanceReports";
	protected static final String TYPE_OMO_WIT_OMOPP_ANNUAL_PERFORMANCE_FINAL = "witomopp:annualPerformanceFinal";
	protected static final String TYPE_OMO_WIT_SGA_ANNUAL_ANALYSIS = "witsga:annualAnalysis";

	protected static final String TYPE_OMO_PMD_CONTRACT_DOC = "pd:contractDocument";
	protected static final String TYPE_OMO_PMD_AWARD_DOC_PD = "pd:awardDocument";
	protected static final String TYPE_OMO_PMD_MODIFICATIONS = "pd:modifications";
	protected static final String TYPE_OMO_PMD_TASK_ORDERS = "pd:taskOrders";
	protected static final String TYPE_OMO_PMD_STATEMENT_OF_WORK = "pd:statementOfWork";
	protected static final String TYPE_OMO_PMD_INVOICES = "pd:invoices";
	protected static final String TYPE_OMO_PMD_OTHER_MISCELLANEOUS = "pd:otherMiscellaneous";

	protected static final String TYPE_OMO_PMD_POST_AWARD_DOC = "ccwf:postAwardDocument";
	protected static final String TYPE_OMO_PMD_PRE_AWARD_DOC = "ccwf:preAwardDocument";
	protected static final String TYPE_OMO_PMD_SOLICITATION_DOC = "ccwf:solicitationDocument";
	protected static final String TYPE_OMO_PMD_AWARD_DOC = "ccwf:awardDocument";
	protected static final String TYPE_OMO_PMD_ADMIN_DOC = "ccwf:administrationDocument";
	protected static final String TYPE_OMO_PMD_INVOICE = "ccwf:invoice";
	protected static final String TYPE_OMO_PMD_MOD_DELIVERY_ORDER_TASK = "ccwf:modDeliveryOrderTask";
	protected static final String TYPE_OMO_PMD_CLOSEOUT = "ccwf:closeOut";
	protected static final String TYPE_OMO_PMD_RATIFICATION = "ccwf:ratification";

	// Sites
	protected static final String SITE_ID_OCM = "ocm";
	protected static final String SITE_ID_OIPM = "oipm";
	protected static final String SITE_ID_OMO = "omo";
	protected static final String SITE_ID_GNMA_PUBLIC = "ginnie-mae-public";
	protected static final String SITE_ID_OSO = "oso";
	protected static final String SITE_ID_OCFO = "ocfo";
	protected static final String SITE_ID_OEDTS = "oedts";
	protected static final String SITE_ID_OER = "oer";
	protected static final String SITE_ID_OPEVP = "opevp";
	protected static final String SITE_ID_CCR = "ccr";

	// Divisions/top-level directories
	protected static final String DIVISION_OCM_MI = "Market Intelligence";
	protected static final String DIVISION_OCM_GEM = "Global Emerging Market";
	protected static final String DIVISION_OCM_SS = "Structured Solutions";
	protected static final String DIVISION_OIPM_SF = "Single-Family";
	protected static final String DIVISION_OIPM_MF_ISSR_APP_DOC = "Multifamily/Issuer Application Documents";
	protected static final String DIVISION_OIPM_MF_ISSR_FILES = "Multifamily/Issuer Application Documents/Issuer Files";
	protected static final String DIVISION_OIPM_MF_ISSR_SUPP_FILES = "Multifamily/Issuer Application Documents/Supplemental Files";
	protected static final String DIVISION_OIPM_MF_ISSR_MISC_FILES = "Multifamily/Issuer Application Documents/Miscellaneous Files";
	protected static final String DIVISION_OIPM_MF_FBI_COVERAGE = "Multifamily/Issuer Application Documents/Evidence of Fidelity Bond Insurance Coverage";
	protected static final String DIVISION_OIPM_MF_COI_DOC = "Multifamily/Issuer Application Documents/Certificate of Insurance (ACORD document)";
	protected static final String DIVISION_OIPM_MF_EEO_COVERAGE = "Multifamily/Issuer Application Documents/Evidence of Errors and Omissions Coverage";
	protected static final String DIVISION_OIPM_MF_ORG_CHART_FAM_AFF = "Multifamily/Issuer Application Documents/Organizational Chart for Corporate Family and Affiliates";
	protected static final String DIVISION_OIPM_MF_APPLICANT_ORG_CHART = "Multifamily/Issuer Application Documents/Applicant’s Organizational Structure Chart";
	protected static final String DIVISION_OIPM_MF_EXEC_SUBSERVICING = "Multifamily/Issuer Application Documents/Executed Subservicing Agreement";
	protected static final String DIVISION_OIPM_MF_SUPP_DOC = "Multifamily/OIPM Supplemental Documents";
	protected static final String DIVISION_OIPM_MF_FORMAL_REQUEST = "Multifamily/Formal Request";
	protected static final String DIVISION_OIPM_MF_ENTERPRISE_CORR = "Multifamily/Enterprise Correspondence";
	protected static final String DIVISION_OIPM_MF_CONTRACT_DOC = "Multifamily/Contract Documents";
	protected static final String DIVISION_OIPM_MF_HIST_CONTRACT_DOC = "Multifamily/Historical Contract Documents";
	protected static final String DIVISION_OIPM_MF_SCAN_CONTRACT_DOC = "Multifamily/Scanned Contract Documents (document custodian - Ashley Askin contact)";
	protected static final String DIVISION_OIPM_MF_ELECT_TFR_CONTRACT_DOC = "Multifamily/Electronic Transfer Contract Documents";
	protected static final String DIVISION_OIPM_MF_ELECT_CONTRACT_DOC = "Multifamily/Electronic Contract Documents";
	protected static final String DIVISION_OIPM_MF_TERM_ISSR_DOC = "Multifamily/Terminated Issuer Documents (Already in EDRM)";
	protected static final String DIVISION_OIPM_MF_DEFAULTED_ISSR_DOC = "Multifamily/Defaulted Issuers (Already in EDRM)";

	protected static final String DIVISION_OIPM_SF_ISSR_APP_DOC = "Single-Family/Issuer Application Documents";
	protected static final String DIVISION_OIPM_SF_ISSR_FILES = "Single-Family/Issuer Application Documents/Issuer Files";
	protected static final String DIVISION_OIPM_SF_ISSR_SUPP_FILES = "Single-Family/Issuer Application Documents/Supplemental Files";
	protected static final String DIVISION_OIPM_SF_ISSR_MISC_FILES = "Single-Family/Issuer Application Documents/Miscellaneous Files";
	protected static final String DIVISION_OIPM_SF_FBI_COVERAGE = "Single-Family/Issuer Application Documents/Evidence of Fidelity Bond Insurance Coverage";
	protected static final String DIVISION_OIPM_SF_COI_DOC = "Single-Family/Issuer Application Documents/Certificate of Insurance (ACORD document)";
	protected static final String DIVISION_OIPM_SF_EEO_COVERAGE = "Single-Family/Issuer Application Documents/Evidence of Errors and Omissions Coverage";
	protected static final String DIVISION_OIPM_SF_ORG_CHART_FAM_AFF = "Single-Family/Issuer Application Documents/Organizational Chart for Corporate Family and Affiliates";
	protected static final String DIVISION_OIPM_SF_APPLICANT_ORG_CHART = "Single-Family/Issuer Application Documents/Applicant’s Organizational Structure Chart";
	protected static final String DIVISION_OIPM_SF_EXEC_SUBSERVICING = "Single-Family/Issuer Application Documents/Executed Subservicing Agreement";
	protected static final String DIVISION_OIPM_SF_SUPP_DOC = "Single-Family/OIPM Supplemental Documents";
	protected static final String DIVISION_OIPM_SF_FORMAL_REQUEST = "Single-Family/Formal Request";
	protected static final String DIVISION_OIPM_SF_ENTERPRISE_CORR = "Single-Family/Enterprise Correspondence";
	protected static final String DIVISION_OIPM_SF_CONTRACT_DOC = "Single-Family/Contract Documents";
	protected static final String DIVISION_OIPM_SF_HIST_CONTRACT_DOC = "Single-Family/Historical Contract Documents";
	protected static final String DIVISION_OIPM_SF_SCAN_CONTRACT_DOC = "Single-Family/Scanned Contract Documents (document custodian - Ashley Askin contact)";
	protected static final String DIVISION_OIPM_SF_ELECT_TFR_CONTRACT_DOC = "Single-Family/Electronic Transfer Contract Documents";
	protected static final String DIVISION_OIPM_SF_ELECT_CONTRACT_DOC = "Single-Family/Electronic Contract Documents";
	protected static final String DIVISION_OIPM_SF_TERM_ISSR_DOC = "Single-Family/Terminated Issuer Documents (Already in EDRM)";
	protected static final String DIVISION_OIPM_SF_DEFAULTED_ISSR_DOC = "Single-Family/Defaulted Issuers (Already in EDRM)";

	protected static final String DIVISION_OIPM_MAAM = "Monitoring And Asset Management";
	protected static final String DIVISION_OIPM_MH = "Manufactured Housing";
	protected static final String DIVISION_OMO_PMD = "Procurement Management Division (PMD)";
	protected static final String DIVISION_OMO_AMD = "Administration Management Division (AMD)";
	protected static final String DIVISION_OMO_WIT = "Workforce Innovation Team (WIT)";

	protected static final String DIVISION_OMO_AMD_ELR_HEARING = "Administration Management Division (AMD)/Employee Labor Relations/Hearing";
	protected static final String DIVISION_OMO_AMD_ELR_COMPLAINT = "Administration Management Division (AMD)/Employee Labor Relations/Complaint";
	protected static final String DIVISION_OMO_AMD_HR_SEPARATIONS = "Administration Management Division (AMD)/HR/Separations";
	protected static final String DIVISION_OMO_AMD_HR_PERFORMANCE = "Administration Management Division (AMD)/HR/Performance";
	protected static final String DIVISION_OMO_AMD_TRNG_MANDATORY_INCOMPASS = "Administration Management Division (AMD)/Training/Mandatory (InCompass)";
	protected static final String DIVISION_OMO_AMD_TRNG_CONTINUING_EDUCATION = "Administration Management Division (AMD)/Training/Continuing Education";
	protected static final String DIVISION_OMO_AMD_TRNG_CERTIFICATIONS = "Administration Management Division (AMD)/Training/Certifications";
	protected static final String DIVISION_OMO_AMD_TRNG_LEADERSHIP_DEVELOPMENT = "Administration Management Division (AMD)/Training/Leadership Development";
	protected static final String DIVISION_OMO_AMD_SOP_TRAINING_REQUEST = "Administration Management Division (AMD)/SOP/Training Request";
	protected static final String DIVISION_OMO_AMD_PERSONNEL_AWARDS = "Administration Management Division (AMD)/Personnel/Awards";
	protected static final String DIVISION_OMO_AMD_PERSONNEL_PROMOTIONS = "Administration Management Division (AMD)/Personnel/Promotions";
	protected static final String DIVISION_OMO_AMD_PERSONNEL_DETAILS = "Administration Management Division (AMD)/Personnel/Details";
	protected static final String DIVISION_OMO_AMD_PERSONNEL_REASSIGNMENTS = "Administration Management Division (AMD)/Personnel/Reassignments";
	protected static final String DIVISION_OMO_AMD_PERSONNEL_DISCIPLINARY_ACTIONS = "Administration Management Division (AMD)/Personnel/Disciplinary Actions";

	
	protected static final String DIVISION_OMO_WIT_HCR_BIWEEKLY_REPORT =             "Workforce Innovation Team (WIT)/Human Capital Report/Biweekly Report";
	protected static final String DIVISION_OMO_WIT_GP_BIWEEKLY_EDITION =             "Workforce Innovation Team (WIT)/Ginnie Post (Newsletter)/Biweekly Edition";
	protected static final String DIVISION_OMO_WIT_FEVS_ANNUAL_FISCAL_YEAR =         "Workforce Innovation Team (WIT)/Federal Employee Viewpoint Survey/Annual Fiscal Year";
	protected static final String DIVISION_OMO_WIT_OMOS_ANNUAL_PERFORMANCE_REPORTS = "Workforce Innovation Team (WIT)/OMO Scorecard/Annual Performance Reports";
	protected static final String DIVISION_OMO_WIT_OMOPP_ANNUAL_PERFORMANCE_FINAL =  "Workforce Innovation Team (WIT)/OMO Performance Plan/Annual Performance Final";
	protected static final String DIVISION_OMO_WIT_SGA_ANNUAL_ANALYSIS =             "Workforce Innovation Team (WIT)/Skill Gap Analysis/Annual Analysis";

	protected static final String DIVISION_OMO_PMD_CCWF_PRE_AWARD = "Procurement Management Division (PMD)/COR Contract Working Files/Pre-Award Documents";
	protected static final String DIVISION_OMO_PMD_CCWF_SOLICITATION = "Procurement Management Division (PMD)/COR Contract Working Files/Solicitation Documents";
	protected static final String DIVISION_OMO_PMD_CCWF_AWARD = "Procurement Management Division (PMD)/COR Contract Working Files/Award Documents";
	protected static final String DIVISION_OMO_PMD_CCWF_ADMIN = "Procurement Management Division (PMD)/COR Contract Working Files/Administration Documents";
	protected static final String DIVISION_OMO_PMD_CCWF_INVOICES = "Procurement Management Division (PMD)/COR Contract Working Files/Invoices";
	protected static final String DIVISION_OMO_PMD_CCWF_MODS_DELIVERY_ORDERS_TASKS = "Procurement Management Division (PMD)/COR Contract Working Files/Modifications, Delivery Orders, Tasks";
	protected static final String DIVISION_OMO_PMD_CCWF_CLOSEOUT = "Procurement Management Division (PMD)/COR Contract Working Files/Close-Out";
	protected static final String DIVISION_OMO_PMD_CCWF_RATIFICATION = "Procurement Management Division (PMD)/COR Contract Working Files/Ratification";
	protected static final String DIVISION_OMO_PMD_CCWF_POST_AWARD = "Procurement Management Division (PMD)/COR Contract Working Files/Post-Award Documents";

	protected static final String DIVISION_OMO_PMD_PD_CONTRACT = "Procurement Management Division (PMD)/Procurement Documents/Contract Documents";
	protected static final String DIVISION_OMO_PMD_PD_AWARD = "Procurement Management Division (PMD)/Procurement Documents/Award Documents";
	protected static final String DIVISION_OMO_PMD_PD_MOD = "Procurement Management Division (PMD)/Procurement Documents/Modifications";
	protected static final String DIVISION_OMO_PMD_PD_TASK = "Procurement Management Division (PMD)/Procurement Documents/Task Orders";
	protected static final String DIVISION_OMO_PMD_PD_SOW = "Procurement Management Division (PMD)/Procurement Documents/Statement of Work";
	protected static final String DIVISION_OMO_PMD_PD_INVOICES = "Procurement Management Division (PMD)/Procurement Documents/Invoices";
	protected static final String DIVISION_OMO_PMD_PD_OTHER = "Procurement Management Division (PMD)/Procurement Documents/Other, Miscellaneous";

	protected static final String DIVISION_PUBLIC_APM = "All Participant Memos";

	protected static final String DIVISION_OSO_PPD = "Process and Product Development (PPD)";
	protected static final String DIVISION_OSO_MBS = "Mortgage-Backed Securities (MBS)";
	protected static final String DIVISION_OSO_PAD = "Program Administration Division (PAD)";
	protected static final String DIVISION_OSO_CX = "Customer Experience (CX)";

	protected static final String DIVISION_OCFO_GC = "Governance and Compliance";
	protected static final String DIVISION_OCFO_CD = "Controller’s Division";
	protected static final String DIVISION_OCFO_TD = "Treasury Division";
	protected static final String DIVISION_OCFO_BT = "Budget";

	protected static final String DIVISION_OCFO_TFR_CASH_RECEIPT_VOUCHER = "Treasury Division/Treasury Financial Records/Fiscal Year 2021/Cash Receipts Vouchers (CRVs)";
	protected static final String DIVISION_OCFO_TFR_DISB_VOUCHER_GSA_CONTRACT = "Treasury Division/Treasury Financial Records/Fiscal Year 2021/Disbursement Vouchers (DVs)/GSA Contracts";
	protected static final String DIVISION_OCFO_TFR_DISB_VOUCHER_NonGSA_CONTRACT = "Treasury Division/Treasury Financial Records/Fiscal Year 2021/Disbursement Vouchers (DVs)/Non-GSA Contracts";
	protected static final String DIVISION_OCFO_TFR_DISB_VOUCHER_MISCELLANEOUS = "Treasury Division/Treasury Financial Records/Fiscal Year 2021/Disbursement Vouchers (DVs)/Miscellaneous";

	
	protected static final String DIVISION_OEDTS_PMO = "Project Management Office (PMO)";
	protected static final String DIVISION_OEDTS_TMD = "Technology Management Division (TMD)";
	protected static final String DIVISION_OEDTS_EDS = "Enterprise Data Solutions Division (EDS)";
	protected static final String DIVISION_OEDTS_INF = "Infrastructure Group";

	protected static final String DIVISION_OER_TRC = "Counterparty Risk Analysis Division (TRC)";
	protected static final String DIVISION_OER_TR = "Economical Modeling Analysis Division (TR)";
	protected static final String DIVISION_OER_TRO = "Operational Risk Analysis Division (TRO)";
	private static final String DIVISION_OER_INFOSEC = "InfoSec";

	protected static final String DIVISION_OPEVP_SPPC = "Strategic Planning, Policy and Communications (SPPC)";
	protected static final String DIVISION_OPEVP_TFG = "Governance and Compliance (TFG)";

	protected static final String DIVISION_CCR_MEDIA = "Media";
	protected static final String DIVISION_CCR_IA = "Industry Associations";
	protected static final String DIVISION_CCR_HUDOPA = "Department of Housing and Urban Development (HUD) Offices of Public Affairs";
	protected static final String DIVISION_CCR_OCIR = "Office of Congressional and Intergovernmental Relations";

	// QNames
	protected static final QName CM_CONTENT = QName.createQName(NAMESPACE_CM, DefaulterUtils.getModelType(TYPE_CM_CONTENT));
	protected static final String SUBTYPE_PROPERTY_NAME = "subtype";

	// Default Content Type Mapping
	// (Subtypes are derived from the defaulted content type)
	protected static final List<String[]> defaultContentTypeMap = Arrays.asList(
			// SITE_ID Divisional Folder Content Type
			// OCM
			new String[] { SITE_ID_OCM, DIVISION_OCM_MI, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OCM, DIVISION_OCM_GEM, TYPE_DAMS_BASE_CONTENT },
			new String[] { SITE_ID_OCM, DIVISION_OCM_SS, TYPE_REMIC },
			// OIPM - Multifamily
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_ISSR_FILES, TYPE_SMF_ISSR_APP_FILES }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_ISSR_SUPP_FILES, TYPE_SMF_ISSR_SUPP_FILES },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_ISSR_MISC_FILES, TYPE_SMF_ISSR_MISC_FILES }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_FBI_COVERAGE, TYPE_SMF_ISSR_FBI_COVERAGE },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_COI_DOC, TYPE_SMF_ISSR_COI_DOC }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_EEO_COVERAGE, TYPE_SMF_ISSR_EEO_COVERAGE },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_ORG_CHART_FAM_AFF, TYPE_SMF_ISSR_ORG_CHART_FAM_AFF },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_APPLICANT_ORG_CHART, TYPE_SMF_ISSR_APPLICANT_ORG_CHART },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_EXEC_SUBSERVICING, TYPE_SMF_ISSR_EXEC_SUBSERVICING }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_ISSR_APP_DOC, TYPE_SMF_ISSR_APP_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_SUPP_DOC, TYPE_SMF_SUPPLEMENTAL_DOC }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_FORMAL_REQUEST, TYPE_SMF_FORMAL_REQUEST },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_ENTERPRISE_CORR, TYPE_SMF_ENTERPRISE_CORR }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_CONTRACT_DOC, TYPE_SMF_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_HIST_CONTRACT_DOC, TYPE_SMF_HIST_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_SCAN_CONTRACT_DOC, TYPE_SMF_SCAN_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_ELECT_TFR_CONTRACT_DOC, TYPE_SMF_ELECTRONIC_TFR_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_ELECT_CONTRACT_DOC, TYPE_SMF_ELECTRONIC_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_TERM_ISSR_DOC, TYPE_SMF_TERMINATED_ISSR_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MF_DEFAULTED_ISSR_DOC, TYPE_SMF_DEFAULTED_ISSR_DOC },
			// OIPM - Single-Family
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_ISSR_FILES, TYPE_SMF_ISSR_APP_FILES }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_ISSR_SUPP_FILES, TYPE_SMF_ISSR_SUPP_FILES },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_ISSR_MISC_FILES, TYPE_SMF_ISSR_MISC_FILES }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_FBI_COVERAGE, TYPE_SMF_ISSR_FBI_COVERAGE },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_COI_DOC, TYPE_SMF_ISSR_COI_DOC }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_EEO_COVERAGE, TYPE_SMF_ISSR_EEO_COVERAGE },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_ORG_CHART_FAM_AFF, TYPE_SMF_ISSR_ORG_CHART_FAM_AFF },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_APPLICANT_ORG_CHART, TYPE_SMF_ISSR_APPLICANT_ORG_CHART },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_EXEC_SUBSERVICING, TYPE_SMF_ISSR_EXEC_SUBSERVICING }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_ISSR_APP_DOC, TYPE_SMF_ISSR_APP_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_SUPP_DOC, TYPE_SMF_SUPPLEMENTAL_DOC }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_FORMAL_REQUEST, TYPE_SMF_FORMAL_REQUEST },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_ENTERPRISE_CORR, TYPE_SMF_ENTERPRISE_CORR }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_CONTRACT_DOC, TYPE_SMF_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_HIST_CONTRACT_DOC, TYPE_SMF_HIST_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_SCAN_CONTRACT_DOC, TYPE_SMF_SCAN_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_ELECT_TFR_CONTRACT_DOC, TYPE_SMF_ELECTRONIC_TFR_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_ELECT_CONTRACT_DOC, TYPE_SMF_ELECTRONIC_CONTRACT_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_TERM_ISSR_DOC, TYPE_SMF_TERMINATED_ISSR_DOC },
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_SF_DEFAULTED_ISSR_DOC, TYPE_SMF_DEFAULTED_ISSR_DOC },
			// OIPM - Monitoring and Asset Management, Manufactured Housing
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MAAM, TYPE_MONITORING_ASSET_MGT_DOC }, 
			new String[] { SITE_ID_OIPM, DIVISION_OIPM_MH, TYPE_MANUFACTURED_HOMES_DOC },
			// OMO
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_POST_AWARD, TYPE_OMO_PMD_POST_AWARD_DOC }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_PRE_AWARD, TYPE_OMO_PMD_PRE_AWARD_DOC }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_SOLICITATION, TYPE_OMO_PMD_SOLICITATION_DOC },
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_AWARD, TYPE_OMO_PMD_AWARD_DOC }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_ADMIN, TYPE_OMO_PMD_ADMIN_DOC },
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_INVOICES, TYPE_OMO_PMD_INVOICE },
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_MODS_DELIVERY_ORDERS_TASKS, TYPE_OMO_PMD_MOD_DELIVERY_ORDER_TASK },
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_CLOSEOUT, TYPE_OMO_PMD_CLOSEOUT }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_RATIFICATION, TYPE_OMO_PMD_RATIFICATION },
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_CCWF_SOLICITATION, TYPE_OMO_PMD_SOLICITATION_DOC }, 

			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_PD_CONTRACT, TYPE_OMO_PMD_CONTRACT_DOC }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_PD_AWARD, TYPE_OMO_PMD_AWARD_DOC_PD }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_PD_MOD, TYPE_OMO_PMD_MODIFICATIONS }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_PD_TASK, TYPE_OMO_PMD_TASK_ORDERS }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_PD_SOW, TYPE_OMO_PMD_STATEMENT_OF_WORK }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_PD_INVOICES, TYPE_OMO_PMD_INVOICES }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD_PD_OTHER, TYPE_OMO_PMD_OTHER_MISCELLANEOUS }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_PMD, TYPE_DAMS_BASE_CONTENT },

			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_ELR_HEARING, TYPE_OMO_AMD_ELR_HEARING }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_ELR_COMPLAINT, TYPE_OMO_AMD_ELR_COMPLAINT },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_HR_SEPARATIONS, TYPE_OMO_AMD_HR_SEPARATIONS }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_HR_PERFORMANCE, TYPE_OMO_AMD_HR_PERFORMANCE },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_TRNG_MANDATORY_INCOMPASS, TYPE_OMO_AMD_TRNG_MANDATORY_INCOMPASS },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_TRNG_CONTINUING_EDUCATION, TYPE_OMO_AMD_TRNG_CONTINUING_EDUCATION },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_TRNG_CERTIFICATIONS, TYPE_OMO_AMD_TRNG_CERTIFICATIONS },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_TRNG_LEADERSHIP_DEVELOPMENT, TYPE_OMO_AMD_TRNG_LEADERSHIP_DEVELOPMENT },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_PERSONNEL_AWARDS, TYPE_OMO_AMD_PERSONNEL_AWARDS },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_PERSONNEL_PROMOTIONS, TYPE_OMO_AMD_PERSONNEL_PROMOTIONS },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_PERSONNEL_DETAILS, TYPE_OMO_AMD_PERSONNEL_DETAILS },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_PERSONNEL_REASSIGNMENTS, TYPE_OMO_AMD_PERSONNEL_REASSIGNMENTS },
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_PERSONNEL_DISCIPLINARY_ACTIONS, TYPE_OMO_AMD_PERSONNEL_DISCIPLINARY_ACTIONS },

			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD_SOP_TRAINING_REQUEST, TYPE_OMO_AMD_SOP_TRAINING_REQUEST }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_AMD, TYPE_DAMS_BASE_CONTENT },

			new String[] { SITE_ID_OMO, DIVISION_OMO_WIT_HCR_BIWEEKLY_REPORT, TYPE_OMO_WIT_HCR_BIWEEKLY_REPORT },
			new String[] { SITE_ID_OMO, DIVISION_OMO_WIT_GP_BIWEEKLY_EDITION, TYPE_OMO_WIT_GP_BIWEEKLY_EDITION },
			new String[] { SITE_ID_OMO, DIVISION_OMO_WIT_FEVS_ANNUAL_FISCAL_YEAR, TYPE_OMO_WIT_FEVS_ANNUAL_FISCAL_YEAR }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_WIT_OMOS_ANNUAL_PERFORMANCE_REPORTS, TYPE_OMO_WIT_OMOS_ANNUAL_PERFORMANCE_REPORTS }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_WIT_OMOPP_ANNUAL_PERFORMANCE_FINAL, TYPE_OMO_WIT_OMOPP_ANNUAL_PERFORMANCE_FINAL }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_WIT_SGA_ANNUAL_ANALYSIS, TYPE_OMO_WIT_SGA_ANNUAL_ANALYSIS }, 
			new String[] { SITE_ID_OMO, DIVISION_OMO_WIT, TYPE_DAMS_BASE_CONTENT },

			// OSO
			new String[] { SITE_ID_OSO, DIVISION_OSO_MBS, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OSO, DIVISION_OSO_PPD, TYPE_DAMS_BASE_CONTENT },
			new String[] { SITE_ID_OSO, DIVISION_OSO_PAD, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OSO, DIVISION_OSO_CX, TYPE_DAMS_BASE_CONTENT },
			// OCFO
			new String[] { SITE_ID_OCFO, DIVISION_OCFO_GC, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OCFO, DIVISION_OCFO_CD, TYPE_DAMS_BASE_CONTENT },
			new String[] { SITE_ID_OCFO, DIVISION_OCFO_BT, TYPE_DAMS_BASE_CONTENT }, 
			// OCFO Treasury (Updated)
			new String[] { SITE_ID_OCFO, DIVISION_OCFO_TFR_CASH_RECEIPT_VOUCHER, TYPE_OCFO_TFR_CASH_RECEIPT_VOUCHER },
			new String[] { SITE_ID_OCFO, DIVISION_OCFO_TFR_DISB_VOUCHER_GSA_CONTRACT, TYPE_OCFO_TFR_DISB_VOUCHER_GSA_CONTRACT },
			new String[] { SITE_ID_OCFO, DIVISION_OCFO_TFR_DISB_VOUCHER_NonGSA_CONTRACT, TYPE_OCFO_TFR_DISB_VOUCHER_NonGSA_CONTRACT },
			new String[] { SITE_ID_OCFO, DIVISION_OCFO_TFR_DISB_VOUCHER_MISCELLANEOUS, TYPE_OCFO_TFR_DISB_VOUCHER_MISCELLANEOUS },

			// OEDTS
			new String[] { SITE_ID_OEDTS, DIVISION_OEDTS_PMO, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OEDTS, DIVISION_OEDTS_TMD, TYPE_DAMS_BASE_CONTENT },
			new String[] { SITE_ID_OEDTS, DIVISION_OEDTS_EDS, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OEDTS, DIVISION_OEDTS_INF, TYPE_DAMS_BASE_CONTENT },
			// OER
			new String[] { SITE_ID_OER, DIVISION_OER_TRC, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OER, DIVISION_OER_TR, TYPE_DAMS_BASE_CONTENT },
			new String[] { SITE_ID_OER, DIVISION_OER_TRO, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OER, DIVISION_OER_INFOSEC, TYPE_DAMS_BASE_CONTENT },
			// OPEVP
			new String[] { SITE_ID_OPEVP, DIVISION_OPEVP_SPPC, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_OPEVP, DIVISION_OPEVP_TFG, TYPE_DAMS_BASE_CONTENT },
			// CCR
			new String[] { SITE_ID_CCR, DIVISION_CCR_MEDIA, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_CCR, DIVISION_CCR_IA, TYPE_DAMS_BASE_CONTENT },
			new String[] { SITE_ID_CCR, DIVISION_CCR_HUDOPA, TYPE_DAMS_BASE_CONTENT }, 
			new String[] { SITE_ID_CCR, DIVISION_CCR_OCIR, TYPE_DAMS_BASE_CONTENT },
			// GNMA protected
			new String[] { SITE_ID_GNMA_PUBLIC, DIVISION_PUBLIC_APM, TYPE_APM });

	private BehaviorConstants() {
		// Do not allow protected instantiation
	}

}
