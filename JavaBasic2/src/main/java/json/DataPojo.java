package json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by onkar.mhantati on 5/9/2018.
 */
public class DataPojo {

    @SerializedName("signUp_Success")
    @Expose
    private String signUpSuccess;
    @SerializedName("password_Change_Success")
    @Expose
    private String passwordChangeSuccess;
    @SerializedName("profile_Update_Success")
    @Expose
    private String profileUpdateSuccess;
    @SerializedName("forget_Password_Success")
    @Expose
    private String forgetPasswordSuccess;
    @SerializedName("wrong_Credentials")
    @Expose
    private String wrongCredentials;
    @SerializedName("finger_Print_Success")
    @Expose
    private String fingerPrintSuccess;
    @SerializedName("incorrect_Finger_Print_Success")
    @Expose
    private String incorrectFingerPrintSuccess;
    @SerializedName("logout_Success")
    @Expose
    private String logoutSuccess;
    @SerializedName("private_Share_Success")
    @Expose
    private String privateShareSuccess;
    @SerializedName("privateShare_Email_delete_Success")
    @Expose
    private String privateShareEmailDeleteSuccess;
    @SerializedName("bulk_Share_success")
    @Expose
    private String bulkShareSuccess;
    @SerializedName("want_Anonymous_Share")
    @Expose
    private String wantAnonymousShare;
    @SerializedName("locked_Decision_For_Others")
    @Expose
    private String lockedDecisionForOthers;
    @SerializedName("warning_message_for_view_only_mode")
    @Expose
    private String warningMessageForViewOnlyMode;
    @SerializedName("want_UnLocked_Decision_By_Owner")
    @Expose
    private String wantUnLockedDecisionByOwner;
    @SerializedName("create_New_Decision")
    @Expose
    private String createNewDecision;
    @SerializedName("prompt_For_Delete_Decision")
    @Expose
    private String promptForDeleteDecision;
    @SerializedName("prompt_For_Unshare_Decision")
    @Expose
    private String promptForUnshareDecision;
    @SerializedName("rename_Decision_Success")
    @Expose
    private String renameDecisionSuccess;
    @SerializedName("import_Decision_success")
    @Expose
    private String importDecisionSuccess;
    @SerializedName("import_Decision_From_SD_CARD_success")
    @Expose
    private String importDecisionFromSDCARDSuccess;
    @SerializedName("import_Decision_From_Google_Drive_success")
    @Expose
    private String importDecisionFromGoogleDriveSuccess;
    @SerializedName("import_Decision_Google_Drive_Success")
    @Expose
    private String importDecisionGoogleDriveSuccess;
    @SerializedName("manual_Sync_No_Data_Found")
    @Expose
    private String manualSyncNoDataFound;
    @SerializedName("export_DecisionFrom_SD_CARD_Or_GoogleDrive_success")
    @Expose
    private String exportDecisionFromSDCARDOrGoogleDriveSuccess;
    @SerializedName("warning_step_1_And_2_complete_before_share")
    @Expose
    private String warningStep1And2CompleteBeforeShare;
    @SerializedName("warning_before_step2_complete")
    @Expose
    private String warningBeforeStep2Complete;
    @SerializedName("choose_your_resolution_Alert")
    @Expose
    private String chooseYourResolutionAlert;
    @SerializedName("please_Check_Your_Internet_Connection")
    @Expose
    private String pleaseCheckYourInternetConnection;
    @SerializedName("please_Enter_Email")
    @Expose
    private String pleaseEnterEmail;
    @SerializedName("please_Enter_Name")
    @Expose
    private String pleaseEnterName;
    @SerializedName("please_Enter_SurName")
    @Expose
    private String pleaseEnterSurName;
    @SerializedName("please_Enter_Country")
    @Expose
    private String pleaseEnterCountry;
    @SerializedName("email_Id_Exists")
    @Expose
    private String emailIdExists;
    @SerializedName("search_Result_Empty_Message")
    @Expose
    private String searchResultEmptyMessage;
    @SerializedName("canNotConnectTo_iTunes")
    @Expose
    private String canNotConnectToITunes;
    @SerializedName("please_Enter_Valid_Email_Id")
    @Expose
    private String pleaseEnterValidEmailId;
    @SerializedName("message_Dashboard_Offline")
    @Expose
    private String messageDashboardOffline;
    @SerializedName("message_Dashboard_Only_View_Access")
    @Expose
    private String messageDashboardOnlyViewAccess;
    @SerializedName("message_Dashboard_Full_Access")
    @Expose
    private String messageDashboardFullAccess;
    @SerializedName("error_In_Connecting_To_Facebook")
    @Expose
    private String errorInConnectingToFacebook;
    @SerializedName("login_Fail_with_Google")
    @Expose
    private String loginFailWithGoogle;
    @SerializedName("decision_Already_shared_with_user")
    @Expose
    private String decisionAlreadySharedWithUser;
    @SerializedName("login_Success_using_Google")
    @Expose
    private String loginSuccessUsingGoogle;
    @SerializedName("login_Success_using_Facebook")
    @Expose
    private String loginSuccessUsingFacebook;
    @SerializedName("trying_Share_Decision_Without_Adding_User")
    @Expose
    private String tryingShareDecisionWithoutAddingUser;
    @SerializedName("iOS_Restore_Purchases_Failure")
    @Expose
    private String iOSRestorePurchasesFailure;
    @SerializedName("expired_Licence_Warning")
    @Expose
    private String expiredLicenceWarning;
    @SerializedName("iOS_Restore_Purchases_Success")
    @Expose
    private String iOSRestorePurchasesSuccess;
    @SerializedName("iOS_Restore_Purchase_No_Purchases")
    @Expose
    private String iOSRestorePurchaseNoPurchases;
    @SerializedName("iOS_Buy_License_Confirmation")
    @Expose
    private String iOSBuyLicenseConfirmation;
    @SerializedName("iOS_Buy_License_Final_Message")
    @Expose
    private String iOSBuyLicenseFinalMessage;
    @SerializedName("android_InAppPurchase_payment_policy")
    @Expose
    private String androidInAppPurchasePaymentPolicy;
    @SerializedName("inAppPurchase_Trail_Period_message")
    @Expose
    private String inAppPurchaseTrailPeriodMessage;
    @SerializedName("inAppPurchase_Instruction")
    @Expose
    private String inAppPurchaseInstruction;
    @SerializedName("iOS_InAppPurchase_payment_policy")
    @Expose
    private String iOSInAppPurchasePaymentPolicy;
    @SerializedName("showcase_Title_Create_New_Decision")
    @Expose
    private String showcaseTitleCreateNewDecision;
    @SerializedName("showcase_Title_My_Decisions")
    @Expose
    private String showcaseTitleMyDecisions;
    @SerializedName("showcase_Title_Shared_Decisions")
    @Expose
    private String showcaseTitleSharedDecisions;
    @SerializedName("showcase_Title_Community_Library")
    @Expose
    private String showcaseTitleCommunityLibrary;
    @SerializedName("showcase_Title_Learning_from_each_other")
    @Expose
    private String showcaseTitleLearningFromEachOther;
    @SerializedName("showcase_Title_Messaging_Interface")
    @Expose
    private String showcaseTitleMessagingInterface;
    @SerializedName("showcase_Title_Share")
    @Expose
    private String showcaseTitleShare;
    @SerializedName("showcase_Create_New_Decision")
    @Expose
    private String showcaseCreateNewDecision;
    @SerializedName("showcase_My_Decisions")
    @Expose
    private String showcaseMyDecisions;
    @SerializedName("showcase_Shared_Decisions")
    @Expose
    private String showcaseSharedDecisions;
    @SerializedName("showcase_Community_Decisions")
    @Expose
    private String showcaseCommunityDecisions;
    @SerializedName("showcase_Learning_From_Each_Other")
    @Expose
    private String showcaseLearningFromEachOther;
    @SerializedName("showcase_Messaging_Interface")
    @Expose
    private String showcaseMessagingInterface;
    @SerializedName("showcase_Share_Button")
    @Expose
    private String showcaseShareButton;
    @SerializedName("bestPractice_DetailsMultilineSeparator")
    @Expose
    private String bestPracticeDetailsMultilineSeparator;
    @SerializedName("bestPractice_NecessaryAssumption")
    @Expose
    private String bestPracticeNecessaryAssumption;
    @SerializedName("bestPractice_NecessaryAssumption_GapAnalysis")
    @Expose
    private String bestPracticeNecessaryAssumptionGapAnalysis;
    @SerializedName("bestPractice_ParallelAssumptions_ForMethods1And2")
    @Expose
    private String bestPracticeParallelAssumptionsForMethods1And2;
    @SerializedName("bestPractice_ParallelAssumptions_ForMethods3And4")
    @Expose
    private String bestPracticeParallelAssumptionsForMethods3And4;
    @SerializedName("bestPractice_ParallelAssumptions_ForMethods_Option1_SimpleResolution")
    @Expose
    private String bestPracticeParallelAssumptionsForMethodsOption1SimpleResolution;
    @SerializedName("bestPractice_ParallelAssumptions_ForMethods_Option2_SimpleResolution")
    @Expose
    private String bestPracticeParallelAssumptionsForMethodsOption2SimpleResolution;
    @SerializedName("bestPractice_ParallelAssumptions_ForMethods_Option3_SimpleResolution")
    @Expose
    private String bestPracticeParallelAssumptionsForMethodsOption3SimpleResolution;
    @SerializedName("bestPractice_ParallelAssumptions_ForMethods_Option4_SimpleResolution")
    @Expose
    private String bestPracticeParallelAssumptionsForMethodsOption4SimpleResolution;
    @SerializedName("bestPractice_ParallelAssumptions_YesBut")
    @Expose
    private String bestPracticeParallelAssumptionsYesBut;
    @SerializedName("bestPractice_Strategy")
    @Expose
    private String bestPracticeStrategy;
    @SerializedName("bestPractice_SufficiencyAssumptions")
    @Expose
    private String bestPracticeSufficiencyAssumptions;
    @SerializedName("bestPractice_Tactic_ForMethods1And2")
    @Expose
    private String bestPracticeTacticForMethods1And2;
    @SerializedName("bestPractice_Tactic_ForMethods3And4")
    @Expose
    private String bestPracticeTacticForMethods3And4;
    @SerializedName("bestPractice_Tactic_YesBut")
    @Expose
    private String bestPracticeTacticYesBut;
    @SerializedName("bestPractice_Title")
    @Expose
    private String bestPracticeTitle;
    @SerializedName("bestPractice_TitleMultilineSeparator")
    @Expose
    private String bestPracticeTitleMultilineSeparator;
    @SerializedName("caption_BestPracticeNode")
    @Expose
    private String captionBestPracticeNode;
    @SerializedName("caption_ChallengingAssumptionsAnalysis")
    @Expose
    private String captionChallengingAssumptionsAnalysis;
    @SerializedName("caption_GapAnalysis")
    @Expose
    private String captionGapAnalysis;
    @SerializedName("caption_NewRule")
    @Expose
    private String captionNewRule;
    @SerializedName("caption_NewRuleConflict_Execution")
    @Expose
    private String captionNewRuleConflictExecution;
    @SerializedName("caption_NewRuleConflict_Planning")
    @Expose
    private String captionNewRuleConflictPlanning;
    @SerializedName("caption_ResolutionMethod1")
    @Expose
    private String captionResolutionMethod1;
    @SerializedName("caption_ResolutionMethod2")
    @Expose
    private String captionResolutionMethod2;
    @SerializedName("caption_ResolutionMethod3")
    @Expose
    private String captionResolutionMethod3;
    @SerializedName("caption_ResolutionMethod4")
    @Expose
    private String captionResolutionMethod4;
    @SerializedName("caption_RuleConflict_Execution")
    @Expose
    private String captionRuleConflictExecution;
    @SerializedName("caption_RuleConflict_Planning")
    @Expose
    private String captionRuleConflictPlanning;
    @SerializedName("caption_YesButAnalysis")
    @Expose
    private String captionYesButAnalysis;
    @SerializedName("conflictRule_YesButCategory_Insufficiency")
    @Expose
    private String conflictRuleYesButCategoryInsufficiency;
    @SerializedName("conflictRule_YesButCategory_Insufficiency_Column1")
    @Expose
    private String conflictRuleYesButCategoryInsufficiencyColumn1;
    @SerializedName("conflictRule_YesButCategory_Insufficiency_Column2")
    @Expose
    private String conflictRuleYesButCategoryInsufficiencyColumn2;
    @SerializedName("conflictRule_YesButCategory_Obstacles")
    @Expose
    private String conflictRuleYesButCategoryObstacles;
    @SerializedName("conflictRule_YesButCategory_Obstacles_Column1")
    @Expose
    private String conflictRuleYesButCategoryObstaclesColumn1;
    @SerializedName("conflictRule_YesButCategory_Obstacles_Column2")
    @Expose
    private String conflictRuleYesButCategoryObstaclesColumn2;
    @SerializedName("conflictRule_YesButCategory_Stakeholder")
    @Expose
    private String conflictRuleYesButCategoryStakeholder;
    @SerializedName("conflictRule_YesButCategory_UnDesirableEffects")
    @Expose
    private String conflictRuleYesButCategoryUnDesirableEffects;
    @SerializedName("conflictRule_YesButCategory_UnDesirableEffects_Column1")
    @Expose
    private String conflictRuleYesButCategoryUnDesirableEffectsColumn1;
    @SerializedName("conflictRule_YesButCategory_UnDesirableEffects_Column2")
    @Expose
    private String conflictRuleYesButCategoryUnDesirableEffectsColumn2;
    @SerializedName("defaultNodeTitle_Gap")
    @Expose
    private String defaultNodeTitleGap;
    @SerializedName("defaultNodeTitle_Rule1_Goal")
    @Expose
    private String defaultNodeTitleRule1Goal;
    @SerializedName("defaultNodeTitle_Rule2_Goal")
    @Expose
    private String defaultNodeTitleRule2Goal;
    @SerializedName("defaultNodeTitle_Impact")
    @Expose
    private String defaultNodeTitleImpact;
    @SerializedName("defaultNodeTitle_Problem")
    @Expose
    private String defaultNodeTitleProblem;
    @SerializedName("defaultNodeTitle_Rule2_Risk1")
    @Expose
    private String defaultNodeTitleRule2Risk1;
    @SerializedName("defaultNodeTitle_Rule2_Risk2")
    @Expose
    private String defaultNodeTitleRule2Risk2;
    @SerializedName("defaultNodeTitle_Rule1_Tactic1")
    @Expose
    private String defaultNodeTitleRule1Tactic1;
    @SerializedName("defaultNodeTitle_Rule1_Tactic1_other")
    @Expose
    private String defaultNodeTitleRule1Tactic1Other;
    @SerializedName("defaultNodeTitle_Rule1_Tactic1_me")
    @Expose
    private String defaultNodeTitleRule1Tactic1Me;
    @SerializedName("defaultNodeTitle_Rule1_Tactic2")
    @Expose
    private String defaultNodeTitleRule1Tactic2;
    @SerializedName("defaultNodeTitle_Rule1_Tactic2_other")
    @Expose
    private String defaultNodeTitleRule1Tactic2Other;
    @SerializedName("defaultNodeTitle_Rule1_Tactic2_me")
    @Expose
    private String defaultNodeTitleRule1Tactic2Me;
    @SerializedName("defaultNodeTitle_Rule2_Tactic1")
    @Expose
    private String defaultNodeTitleRule2Tactic1;
    @SerializedName("defaultNodeTitle_Rule2_Tactic2")
    @Expose
    private String defaultNodeTitleRule2Tactic2;
    @SerializedName("defaultNodeTitle_Rule2_Strategy1")
    @Expose
    private String defaultNodeTitleRule2Strategy1;
    @SerializedName("defaultNodeTitle_Rule2_Strategy2")
    @Expose
    private String defaultNodeTitleRule2Strategy2;
    @SerializedName("defaultNodeTitle_Rule1_Threat")
    @Expose
    private String defaultNodeTitleRule1Threat;
    @SerializedName("defaultNodeTitle_Rule2_Threat")
    @Expose
    private String defaultNodeTitleRule2Threat;
    @SerializedName("defaultNodeTitle_Ude")
    @Expose
    private String defaultNodeTitleUde;
    @SerializedName("mergedConflictProperyItem")
    @Expose
    private String mergedConflictProperyItem;
    @SerializedName("mergedConflictTemporaryName")
    @Expose
    private String mergedConflictTemporaryName;
    @SerializedName("mergedConflictTitle")
    @Expose
    private String mergedConflictTitle;
    @SerializedName("mergedConflictValuesSeparator")
    @Expose
    private String mergedConflictValuesSeparator;
    @SerializedName("method1Way1_Guide_Assumption")
    @Expose
    private String method1Way1GuideAssumption;
    @SerializedName("method1Way1_Guide_HowTo")
    @Expose
    private String method1Way1GuideHowTo;
    @SerializedName("method1Way1_Guide_Injection")
    @Expose
    private String method1Way1GuideInjection;
    @SerializedName("method1Way1_Value_Assumption")
    @Expose
    private String method1Way1ValueAssumption;
    @SerializedName("method1Way1_Value_HowTo")
    @Expose
    private String method1Way1ValueHowTo;
    @SerializedName("method1Way1_Value_Injection")
    @Expose
    private String method1Way1ValueInjection;
    @SerializedName("method1Way2_Guide_Assumption")
    @Expose
    private String method1Way2GuideAssumption;
    @SerializedName("method1Way2_Guide_HowTo")
    @Expose
    private String method1Way2GuideHowTo;
    @SerializedName("method1Way2_Guide_Injection")
    @Expose
    private String method1Way2GuideInjection;
    @SerializedName("method1Way2_Value_Assumption")
    @Expose
    private String method1Way2ValueAssumption;
    @SerializedName("method1Way2_Value_HowTo")
    @Expose
    private String method1Way2ValueHowTo;
    @SerializedName("method1Way2_Value_Injection")
    @Expose
    private String method1Way2ValueInjection;
    @SerializedName("method2Way1_Guide_Assumption")
    @Expose
    private String method2Way1GuideAssumption;
    @SerializedName("method2Way1_Guide_HowTo")
    @Expose
    private String method2Way1GuideHowTo;
    @SerializedName("method2Way1_Guide_Injection")
    @Expose
    private String method2Way1GuideInjection;
    @SerializedName("method2Way1_Value_Assumption")
    @Expose
    private String method2Way1ValueAssumption;
    @SerializedName("method2Way1_Value_HowTo")
    @Expose
    private String method2Way1ValueHowTo;
    @SerializedName("method2Way1_Value_Injection")
    @Expose
    private String method2Way1ValueInjection;
    @SerializedName("method2Way2_Guide_Assumption")
    @Expose
    private String method2Way2GuideAssumption;
    @SerializedName("method2Way2_Guide_HowTo")
    @Expose
    private String method2Way2GuideHowTo;
    @SerializedName("method2Way2_Guide_Injection")
    @Expose
    private String method2Way2GuideInjection;
    @SerializedName("method2Way2_Value_Assumption")
    @Expose
    private String method2Way2ValueAssumption;
    @SerializedName("method2Way2_Value_HowTo")
    @Expose
    private String method2Way2ValueHowTo;
    @SerializedName("method2Way2_Value_Injection")
    @Expose
    private String method2Way2ValueInjection;
    @SerializedName("method3Way1_Guide_Assumption")
    @Expose
    private String method3Way1GuideAssumption;
    @SerializedName("method3Way1_Guide_HowTo")
    @Expose
    private String method3Way1GuideHowTo;
    @SerializedName("method3Way1_Guide_Injection")
    @Expose
    private String method3Way1GuideInjection;
    @SerializedName("method3Way1_Value_Assumption")
    @Expose
    private String method3Way1ValueAssumption;
    @SerializedName("method3Way1_Value_HowTo")
    @Expose
    private String method3Way1ValueHowTo;
    @SerializedName("method3Way1_Value_Injection")
    @Expose
    private String method3Way1ValueInjection;
    @SerializedName("method4Way1_Guide_Assumption")
    @Expose
    private String method4Way1GuideAssumption;
    @SerializedName("method4Way1_Guide_HowTo")
    @Expose
    private String method4Way1GuideHowTo;
    @SerializedName("method4Way1_Guide_Injection")
    @Expose
    private String method4Way1GuideInjection;
    @SerializedName("method4Way1_Value_Assumption")
    @Expose
    private String method4Way1ValueAssumption;
    @SerializedName("method4Way1_Value_HowTo")
    @Expose
    private String method4Way1ValueHowTo;
    @SerializedName("method4Way1_Value_Injection")
    @Expose
    private String method4Way1ValueInjection;
    @SerializedName("nodeGroup_Gap")
    @Expose
    private String nodeGroupGap;
    @SerializedName("nodeGroup_Goal")
    @Expose
    private String nodeGroupGoal;
    @SerializedName("nodeGroup_Impact")
    @Expose
    private String nodeGroupImpact;
    @SerializedName("nodeGroup_Problem")
    @Expose
    private String nodeGroupProblem;
    @SerializedName("nodeGroup_Risk1")
    @Expose
    private String nodeGroupRisk1;
    @SerializedName("nodeGroup_Risk2")
    @Expose
    private String nodeGroupRisk2;
    @SerializedName("nodeGroup_Strategy1")
    @Expose
    private String nodeGroupStrategy1;
    @SerializedName("nodeGroup_Strategy2")
    @Expose
    private String nodeGroupStrategy2;
    @SerializedName("nodeGroup_Tactic1")
    @Expose
    private String nodeGroupTactic1;
    @SerializedName("nodeGroup_Tactic2")
    @Expose
    private String nodeGroupTactic2;
    @SerializedName("nodeGroup_TacticMethod1")
    @Expose
    private String nodeGroupTacticMethod1;
    @SerializedName("nodeGroup_TacticMethod2")
    @Expose
    private String nodeGroupTacticMethod2;
    @SerializedName("nodeGroup_TacticMethod3")
    @Expose
    private String nodeGroupTacticMethod3;
    @SerializedName("nodeGroup_TacticMethod4")
    @Expose
    private String nodeGroupTacticMethod4;
    @SerializedName("nodeGroup_Threat")
    @Expose
    private String nodeGroupThreat;
    @SerializedName("nodeGroup_Ude")
    @Expose
    private String nodeGroupUde;
    @SerializedName("nodeGuide_Gap")
    @Expose
    private String nodeGuideGap;
    @SerializedName("nodeGuide_Impact")
    @Expose
    private String nodeGuideImpact;
    @SerializedName("nodeGuide_Problem")
    @Expose
    private String nodeGuideProblem;
    @SerializedName("nodeGuide_Rule1_Goal")
    @Expose
    private String nodeGuideRule1Goal;
    @SerializedName("nodeGuide_Rule1_Risk1")
    @Expose
    private String nodeGuideRule1Risk1;
    @SerializedName("nodeGuide_Rule1_Risk2")
    @Expose
    private String nodeGuideRule1Risk2;
    @SerializedName("nodeGuide_Rule1_Strategy1")
    @Expose
    private String nodeGuideRule1Strategy1;
    @SerializedName("nodeGuide_Rule1_Strategy2")
    @Expose
    private String nodeGuideRule1Strategy2;
    @SerializedName("nodeGuide_Rule1_Tactic1")
    @Expose
    private String nodeGuideRule1Tactic1;
    @SerializedName("nodeGuide_Rule1_Tactic2")
    @Expose
    private String nodeGuideRule1Tactic2;
    @SerializedName("nodeGuide_Rule1_Threat")
    @Expose
    private String nodeGuideRule1Threat;
    @SerializedName("nodeGuide_Rule2_Goal")
    @Expose
    private String nodeGuideRule2Goal;
    @SerializedName("nodeGuide_Rule2_Risk1")
    @Expose
    private String nodeGuideRule2Risk1;
    @SerializedName("nodeGuide_Rule2_Risk2")
    @Expose
    private String nodeGuideRule2Risk2;
    @SerializedName("nodeGuide_Rule2_Strategy1")
    @Expose
    private String nodeGuideRule2Strategy1;
    @SerializedName("nodeGuide_Rule2_Strategy2")
    @Expose
    private String nodeGuideRule2Strategy2;
    @SerializedName("nodeGuide_Rule2_Tactic1")
    @Expose
    private String nodeGuideRule2Tactic1;
    @SerializedName("nodeGuide_Rule2_Tactic2")
    @Expose
    private String nodeGuideRule2Tactic2;
    @SerializedName("nodeGuide_Rule2_Threat")
    @Expose
    private String nodeGuideRule2Threat;
    @SerializedName("nodeGuide_TacticMethod1")
    @Expose
    private String nodeGuideTacticMethod1;
    @SerializedName("nodeGuide_TacticMethod2")
    @Expose
    private String nodeGuideTacticMethod2;
    @SerializedName("nodeGuide_TacticMethod3")
    @Expose
    private String nodeGuideTacticMethod3;
    @SerializedName("nodeGuide_TacticMethod4")
    @Expose
    private String nodeGuideTacticMethod4;
    @SerializedName("nodeGuide_Ude")
    @Expose
    private String nodeGuideUde;
    @SerializedName("nodeHeader_Problem")
    @Expose
    private String nodeHeaderProblem;
    @SerializedName("nodeHeader_Gap")
    @Expose
    private String nodeHeaderGap;
    @SerializedName("nodeHeader_Impact")
    @Expose
    private String nodeHeaderImpact;
    @SerializedName("nodeHeader_Goal_Rule1")
    @Expose
    private String nodeHeaderGoalRule1;
    @SerializedName("nodeHeader_Goal_Rule2")
    @Expose
    private String nodeHeaderGoalRule2;
    @SerializedName("nodeHeader_Risk1_Rule1")
    @Expose
    private String nodeHeaderRisk1Rule1;
    @SerializedName("nodeHeader_Risk1_Rule2")
    @Expose
    private String nodeHeaderRisk1Rule2;
    @SerializedName("nodeHeader_Strategy1_Rule1")
    @Expose
    private String nodeHeaderStrategy1Rule1;
    @SerializedName("nodeHeader_Strategy1_Rule2")
    @Expose
    private String nodeHeaderStrategy1Rule2;
    @SerializedName("nodeHeader_Tactic1_Rule1")
    @Expose
    private String nodeHeaderTactic1Rule1;
    @SerializedName("nodeHeader_Tactic1_Rule2")
    @Expose
    private String nodeHeaderTactic1Rule2;
    @SerializedName("nodeHeader_Risk2_Rule1")
    @Expose
    private String nodeHeaderRisk2Rule1;
    @SerializedName("nodeHeader_Risk2_Rule2")
    @Expose
    private String nodeHeaderRisk2Rule2;
    @SerializedName("nodeHeader_Strategy2_Rule1")
    @Expose
    private String nodeHeaderStrategy2Rule1;
    @SerializedName("nodeHeader_Strategy2_Rule2")
    @Expose
    private String nodeHeaderStrategy2Rule2;
    @SerializedName("nodeHeader_Tactic2_Rule1")
    @Expose
    private String nodeHeaderTactic2Rule1;
    @SerializedName("nodeHeader_Tactic2_Rule2")
    @Expose
    private String nodeHeaderTactic2Rule2;
    @SerializedName("nodeHeader_Threat_Rule1")
    @Expose
    private String nodeHeaderThreatRule1;
    @SerializedName("nodeHeader_Threat_Rule2")
    @Expose
    private String nodeHeaderThreatRule2;
    @SerializedName("nodeHeader_Ude")
    @Expose
    private String nodeHeaderUde;
    @SerializedName("nodeNumber_Gap")
    @Expose
    private String nodeNumberGap;
    @SerializedName("nodeNumber_Goal")
    @Expose
    private String nodeNumberGoal;
    @SerializedName("nodeNumber_Impact")
    @Expose
    private String nodeNumberImpact;
    @SerializedName("nodeNumber_Problem")
    @Expose
    private String nodeNumberProblem;
    @SerializedName("nodeNumber_Risk")
    @Expose
    private String nodeNumberRisk;
    @SerializedName("nodeNumber_Strategy")
    @Expose
    private String nodeNumberStrategy;
    @SerializedName("nodeNumber_Tactic")
    @Expose
    private String nodeNumberTactic;
    @SerializedName("nodeNumber_TacticMethod")
    @Expose
    private String nodeNumberTacticMethod;
    @SerializedName("nodeNumber_Threat")
    @Expose
    private String nodeNumberThreat;
    @SerializedName("nodeNumber_Ude")
    @Expose
    private String nodeNumberUde;
    @SerializedName("resolutionMethod_FistPlus")
    @Expose
    private String resolutionMethodFistPlus;
    @SerializedName("resolutionMethod_HowElse")
    @Expose
    private String resolutionMethodHowElse;
    @SerializedName("resolutionMethod_SecondPlus")
    @Expose
    private String resolutionMethodSecondPlus;
    @SerializedName("resolutionMethod_Why")
    @Expose
    private String resolutionMethodWhy;
    @SerializedName("simpleResolutionMethod1_Question1")
    @Expose
    private String simpleResolutionMethod1Question1;
    @SerializedName("simpleResolutionMethod1_Question2")
    @Expose
    private String simpleResolutionMethod1Question2;
    @SerializedName("simpleResolutionMethod2_Question1")
    @Expose
    private String simpleResolutionMethod2Question1;
    @SerializedName("simpleResolutionMethod2_Question2")
    @Expose
    private String simpleResolutionMethod2Question2;
    @SerializedName("simpleResolutionMethod3_Question1")
    @Expose
    private String simpleResolutionMethod3Question1;
    @SerializedName("simpleResolutionMethod3_Question2")
    @Expose
    private String simpleResolutionMethod3Question2;
    @SerializedName("simpleResolutionMethod4_Question1")
    @Expose
    private String simpleResolutionMethod4Question1;
    @SerializedName("simpleResolutionMethod4_Question2")
    @Expose
    private String simpleResolutionMethod4Question2;
    @SerializedName("simpleResolutionMethod3_Tactic1_Title")
    @Expose
    private String simpleResolutionMethod3Tactic1Title;
    @SerializedName("simpleResolutionMethod3_Tactic2_Title")
    @Expose
    private String simpleResolutionMethod3Tactic2Title;
    @SerializedName("simpleResolutionMethod4_Tactic1_Sub_Title")
    @Expose
    private String simpleResolutionMethod4Tactic1SubTitle;
    @SerializedName("simpleResolutionMethod3_Tactic1_Sub_Title")
    @Expose
    private String simpleResolutionMethod3Tactic1SubTitle;
    @SerializedName("simpleResolutionMethod3_Tactic2_Sub_Title")
    @Expose
    private String simpleResolutionMethod3Tactic2SubTitle;
    @SerializedName("resolutionTacticJoinWord")
    @Expose
    private String resolutionTacticJoinWord;
    @SerializedName("tab_RuleType_Execution")
    @Expose
    private String tabRuleTypeExecution;
    @SerializedName("tab_RuleType_Planning")
    @Expose
    private String tabRuleTypePlanning;
    @SerializedName("word_Conflict")
    @Expose
    private String wordConflict;
    @SerializedName("word_Method")
    @Expose
    private String wordMethod;
    @SerializedName("word_RuleType_Execution")
    @Expose
    private String wordRuleTypeExecution;
    @SerializedName("word_RuleType_Planning")
    @Expose
    private String wordRuleTypePlanning;
    @SerializedName("newBestPractice")
    @Expose
    private String newBestPractice;
    @SerializedName("defaultNodeTitle_Rule1_Risk1")
    @Expose
    private String defaultNodeTitleRule1Risk1;
    @SerializedName("defaultNodeTitle_Rule1_Risk2")
    @Expose
    private String defaultNodeTitleRule1Risk2;
    @SerializedName("defaultNodeTitle_Rule1_Strategy1")
    @Expose
    private String defaultNodeTitleRule1Strategy1;
    @SerializedName("defaultNodeTitle_Rule1_Strategy2")
    @Expose
    private String defaultNodeTitleRule1Strategy2;
    @SerializedName("step2b_Question1")
    @Expose
    private String step2bQuestion1;
    @SerializedName("step2b_Question2")
    @Expose
    private String step2bQuestion2;
    @SerializedName("step2b_Question2_Answer1")
    @Expose
    private String step2bQuestion2Answer1;
    @SerializedName("step2b_Question2_Answer2")
    @Expose
    private String step2bQuestion2Answer2;
    @SerializedName("step2b_Question3")
    @Expose
    private String step2bQuestion3;
    @SerializedName("step2b_Question4")
    @Expose
    private String step2bQuestion4;
    @SerializedName("confirmResolution_Option3_Question1")
    @Expose
    private String confirmResolutionOption3Question1;
    @SerializedName("necessaryAssumption")
    @Expose
    private String necessaryAssumption;
    @SerializedName("parallelAssumptions")
    @Expose
    private String parallelAssumptions;
    @SerializedName("strategy")
    @Expose
    private String strategy;
    @SerializedName("sufficiencyAssumptions")
    @Expose
    private String sufficiencyAssumptions;
    @SerializedName("tactic")
    @Expose
    private String tactic;
    @SerializedName("assumption")
    @Expose
    private String assumption;
    @SerializedName("injection")
    @Expose
    private String injection;
    @SerializedName("howTo")
    @Expose
    private String howTo;
    @SerializedName("step_1_The_What")
    @Expose
    private String step1TheWhat;
    @SerializedName("step_2_A_The_What")
    @Expose
    private String step2ATheWhat;
    @SerializedName("step_2_B_The_What")
    @Expose
    private String step2BTheWhat;
    @SerializedName("step_3_1_The_What")
    @Expose
    private String step31TheWhat;
    @SerializedName("step_3_2_The_What")
    @Expose
    private String step32TheWhat;
    @SerializedName("step_3_3_The_What")
    @Expose
    private String step33TheWhat;
    @SerializedName("step_3_4_The_What")
    @Expose
    private String step34TheWhat;
    @SerializedName("step_3_The_What")
    @Expose
    private String step3TheWhat;
    @SerializedName("step_4_The_What")
    @Expose
    private String step4TheWhat;
    @SerializedName("step_5_The_What")
    @Expose
    private String step5TheWhat;
    @SerializedName("just_Do_It_The_What")
    @Expose
    private String justDoItTheWhat;

    //##..............................................
    @SerializedName("step_1_The_Why_Title")
    @Expose
    private String step1TheWhyTitle;
    @SerializedName("step_1_The_What_Title")
    @Expose
    private String step1TheWhatTitle;
    @SerializedName("step_1_The_How_Work_Title")
    @Expose
    private String step1TheHowWorkTitle;
    @SerializedName("step_1_The_How_Home_Title")
    @Expose
    private String step1TheHowHomeTitle;
    @SerializedName("step_2_A_The_Why_Title")
    @Expose
    private String step2ATheWhyTitle;
    @SerializedName("step_2_A_The_What_Title")
    @Expose
    private String step2ATheWhatTitle;
    @SerializedName("step_2_A_The_How_Work_Title")
    @Expose
    private String step2ATheHowWorkTitle;
    @SerializedName("step_2_A_The_How_Home_Title")
    @Expose
    private String step2ATheHowHomeTitle;
    @SerializedName("step_2_B_The_Why_Title")
    @Expose
    private String step2BTheWhyTitle;
    @SerializedName("step_2_B_The_What_Title")
    @Expose
    private String step2BTheWhatTitle;
    @SerializedName("step_2_B_The_How_Work_Title")
    @Expose
    private String step2BTheHowWorkTitle;
    @SerializedName("step_2_B_The_How_Home_Title")
    @Expose
    private String step2BTheHowHomeTitle;
    @SerializedName("step_3_The_Why_Title")
    @Expose
    private String step3TheWhyTitle;
    @SerializedName("step_3_The_What_Title")
    @Expose
    private String step3TheWhatTitle;
    @SerializedName("step_3_The_How_Title")
    @Expose
    private String step3TheHowTitle;
    @SerializedName("step_4_The_Why_Title")
    @Expose
    private String step4TheWhyTitle;
    @SerializedName("step_4_The_What_Title")
    @Expose
    private String step4TheWhatTitle;
    @SerializedName("step_4_The_How_Work_Title")
    @Expose
    private String step4TheHowWorkTitle;
    @SerializedName("step_4_The_How_Home_Title")
    @Expose
    private String step4TheHowHomeTitle;
    @SerializedName("step_5_The_Why_Title")
    @Expose
    private String step5TheWhyTitle;
    @SerializedName("step_5_The_What_Title")
    @Expose
    private String step5TheWhatTitle;
    @SerializedName("step_5_The_How_Work_Title")
    @Expose
    private String step5TheHowWorkTitle;
    @SerializedName("step_5_The_How_Home_Title")
    @Expose
    private String step5TheHowHomeTitle;
    @SerializedName("just_Do_It_The_Why_Title")
    @Expose
    private String justDoItTheWhyTitle;
    @SerializedName("just_Do_It_The_What_Title")
    @Expose
    private String justDoItTheWhatTitle;
    @SerializedName("just_Do_It_The_How_Work_Title")
    @Expose
    private String justDoItTheHowWorkTitle;
    @SerializedName("just_Do_It_The_How_Home_Title")
    @Expose
    private String justDoItTheHowHomeTitle;
    @SerializedName("step_3_1_The_Why_Title")
    @Expose
    private String step31TheWhyTitle;
    @SerializedName("step_3_1_The_What_Title")
    @Expose
    private String step31TheWhatTitle;
    @SerializedName("step_3_1_The_How_Work_Title")
    @Expose
    private String step31TheHowWorkTitle;
    @SerializedName("step_3_1_The_How_Home_Title")
    @Expose
    private String step31TheHowHomeTitle;
    @SerializedName("step_3_2_The_Why_Title")
    @Expose
    private String step32TheWhyTitle;
    @SerializedName("step_3_2_The_What_Title")
    @Expose
    private String step32TheWhatTitle;
    @SerializedName("step_3_2_The_How_Work_Title")
    @Expose
    private String step32TheHowWorkTitle;
    @SerializedName("step_3_2_The_How_Home_Title")
    @Expose
    private String step32TheHowHomeTitle;
    @SerializedName("step_3_3_The_Why_Title")
    @Expose
    private String step33TheWhyTitle;
    @SerializedName("step_3_3_The_What_Title")
    @Expose
    private String step33TheWhatTitle;
    @SerializedName("step_3_3_The_How_Work_Title")
    @Expose
    private String step33TheHowWorkTitle;
    @SerializedName("step_3_3_The_How_Home_Title")
    @Expose
    private String step33TheHowHomeTitle;
    @SerializedName("step_3_4_The_Why_Title")
    @Expose
    private String step34TheWhyTitle;
    @SerializedName("step_3_4_The_What_Title")
    @Expose
    private String step34TheWhatTitle;
    @SerializedName("step_3_4_The_How_Work_Title")
    @Expose
    private String step34TheHowWorkTitle;
    @SerializedName("step_3_4_The_How_Home_Title")
    @Expose
    private String step34TheHowHomeTitle;
    @SerializedName("step_3_5_The_Why_Title")
    @Expose
    private String step35TheWhyTitle;
    @SerializedName("step_3_5_The_What_Title")
    @Expose
    private String step35TheWhatTitle;
    @SerializedName("step_3_5_The_How_Title")
    @Expose
    private String step35TheHowTitle;
    @SerializedName("step_3_5_The_What")
    @Expose
    private String step35TheWhat;

    @SerializedName("submit_to_Community_After_Completing_Each_Step_Dialog_Btn_Anonymous")
    @Expose
    private String submitToCommunityAfterCompletingEachStepDialogBtnAnonymous;

    @SerializedName("submit_to_Community_After_Completing_Each_Step_Dialog_Btn_Take_Credit")
    @Expose
    private String submitToCommunityAfterCompletingEachStepDialogBtnTakeCredit;

    @SerializedName("submit_to_Community_After_Completing_Each_Step_Dialog_Text")
    @Expose
    private String submitToCommunityAfterCompletingEachStepDialogText;


    @SerializedName("submit_to_Community_After_Completing_Each_Step_Dialog_Btn_No_Thanks")
    @Expose
    private String submitToCommunityAfterCompletingEachStepDialogBtnNoThanks;
    @SerializedName("submit_to_Community_No_Thanks_Confirmation_Dialog_Btn_No")
    @Expose
    private String submitToCommunityNoThanksConfirmationDialogBtnNo;
    @SerializedName("submit_to_Community_No_Thanks_Confirmation_Dialog_Btn_Yes")
    @Expose
    private String submitToCommunityNoThanksConfirmationDialogBtnYes;
    @SerializedName("submit_to_Community_No_Thanks_Confirmation_Dialog_Text")
    @Expose
    private String submitToCommunityNoThanksConfirmationDialogText;


    @SerializedName("label_Add")
    @Expose
    private String labelAdd;
    @SerializedName("sharing_Dialog_Do_You_Want_To_Share_This_Decision")
    @Expose
    private String sharingDialogDoYouWantToShareThisDecision;
    @SerializedName("sharing_Decision_Error_Message")
    @Expose
    private String sharingDecisionErrorMessage;
    @SerializedName("shared_User_Did_Not_Blaming_Message")
    @Expose
    private String sharedUserDidNotBlamingMessage;
    @SerializedName("blaming_Analysis_Dialog")
    @Expose
    private String blamingAnalysisDialog;
    @SerializedName("lable_Author_Of_This_Decision")
    @Expose
    private String lableAuthorOfThisDecision;
    @SerializedName("lable_Anonymous_User")
    @Expose
    private String lableAnonymousUser;

    //##..............................................

    @SerializedName("api_Business_Conflict")
    @Expose
    private String apiBusinessConflict;
    @SerializedName("api_Personal_Conflict")
    @Expose
    private String apiPersonalConflict;
    @SerializedName("api_TestDrive_Successful")
    @Expose
    private String apiTestDriveSuccessful;
    @SerializedName("api_TestDrive_FeedbackStatus_Invalid")
    @Expose
    private String apiTestDriveFeedbackStatusInvalid;
    @SerializedName("api_TestDrive_Category_Required")
    @Expose
    private String apiTestDriveCategoryRequired;
    @SerializedName("api_DeviceType_Required")
    @Expose
    private String apiDeviceTypeRequired;
    @SerializedName("test_Drive_Feedback_Yes")
    @Expose
    private String testDriveFeedbackYes;
    @SerializedName("test_Drive_Feedback_No")
    @Expose
    private String testDriveFeedbackNo;
    @SerializedName("test_Drive_Feedback_Getting_There")
    @Expose
    private String testDriveFeedbackGettingThere;
    @SerializedName("test_Drive_Feedback_Submit")
    @Expose
    private String testDriveFeedbackSubmit;
    @SerializedName("test_Drive_Feedback_Comment")
    @Expose
    private String testDriveFeedbackComment;
    @SerializedName("test_Drive_Ease_Of_Use")
    @Expose
    private String testDriveEaseOfUse;
    @SerializedName("test_Drive_Insights_Gained")
    @Expose
    private String testDriveInsightsGained;
    @SerializedName("test_Drive_Print_Analysis")
    @Expose
    private String testDrivePrintAnalysis;
    @SerializedName("test_Drive_Feedback_Title")
    @Expose
    private String testDriveFeedbackTitle;
    @SerializedName("test_Drive_Do_It_Yourself")
    @Expose
    private String testDriveDoItYourself;
    @SerializedName("test_Drive_Register")
    @Expose
    private String testDriveRegister;
    @SerializedName("test_Drive_Cancel")
    @Expose
    private String testDriveCancel;
    @SerializedName("test_Drive_Feedback_Negative_Message")
    @Expose
    private String testDriveFeedbackNegativeMessage;
    @SerializedName("test_Drive_Feedback_Positive_Message")
    @Expose
    private String testDriveFeedbackPositiveMessage;
    @SerializedName("test_Drive_Feedback_Neutral_Message")
    @Expose
    private String testDriveFeedbackNeutralMessage;
    @SerializedName("test_Drive_Register_For_Step_3_5")
    @Expose
    private String testDriveRegisterForStep35;
    @SerializedName("test_Drive_Warning")
    @Expose
    private String testDriveWarning;
    @SerializedName("test_Drive_Save_Decision")
    @Expose
    private String testDriveSaveDecision;
    @SerializedName("test_Drive_Suggestion")
    @Expose
    private String testDriveSuggestion;
    @SerializedName("test_Drive_Comment")
    @Expose
    private String testDriveComment;
    @SerializedName("label_Ok")
    @Expose
    private String labelOk;


    //QPCC--------------------------------------------------------------------------------------------
    @SerializedName("descision_Criteria_Cons_Rating_Question")
    @Expose
    private String descisionCriteriaConsRatingQuestion;
    @SerializedName("descision_Criteria_Pros_Rating_Question")
    @Expose
    private String descisionCriteriaProsRatingQuestion;

    @SerializedName("create_Decision_Process_Confirmation_Dialog_Text")
    @Expose
    private String createDecisionProcessConfirmationDialogText;
    @SerializedName("create_Decision_Process_Confirmation_Dialog_Btn_Yes")
    @Expose
    private String createDecisionProcessConfirmationDialogBtnYes;
    @SerializedName("create_Decision_Process_Confirmation_Dialog_Btn_No")
    @Expose
    private String createDecisionProcessConfirmationDialogBtnNo;
    @SerializedName("messenger_Confirmation_Dialog_Text")
    @Expose
    private String messengerConfirmationDialogText;
    @SerializedName("messenger_Confirmation_Dialog_Btn_Yes")
    @Expose
    private String messengerConfirmationDialogBtnYes;
    @SerializedName("messenger_Confirmation_Dialog_Btn_No")
    @Expose
    private String messengerConfirmationDialogBtnNo;

    @SerializedName("decision_Criteria_Business")
    @Expose
    private String decisionCriteriaBusiness;
    @SerializedName("decision_Criteria_Personal")
    @Expose
    private String decisionCriteriaPersonal;
    @SerializedName("decision_Criteria_PERMAH")
    @Expose
    private String decisionCriteriaPERMAH;
    @SerializedName("decision_Criteria_Details")
    @Expose
    private String decisionCriteriaDetails;

    @SerializedName("define_Decision_Criteria_Decision_Type_Question")
    @Expose
    private String defineDecisionCriteriaDecisionTypeQuestion;
    @SerializedName("decision_Criteria_PERMAH_Help_Title")
    @Expose
    private String decisionCriteriaPERMAHHelpTitle;

    ////////////
    @SerializedName("exit")
    @Expose
    private String exit;
    @SerializedName("hdm_Like_Dislike_Feedback")
    @Expose
    private String hdmLikeDislikeFeedback;
    @SerializedName("insight_step_1_1")
    @Expose
    private String insightStep11;
    @SerializedName("insight_step_1_2")
    @Expose
    private String insightStep12;
    @SerializedName("insight_step_2_a")
    @Expose
    private String insightStep2A;
    @SerializedName("insight_step_2_a_check_1")
    @Expose
    private String insightStep2ACheck1;
    @SerializedName("insight_step_2_a_check_2")
    @Expose
    private String insightStep2ACheck2;
    @SerializedName("insight_step_2_a_check_2_1")
    @Expose
    private String insightStep2ACheck21;
    @SerializedName("insight_step_2_a_check_2_2")
    @Expose
    private String insightStep2ACheck22;
    @SerializedName("let_me_edit_them")
    @Expose
    private String letMeEditThem;
    @SerializedName("they_are_unique_and_important")
    @Expose
    private String theyAreUniqueAndImportant;
    @SerializedName("yes_let_me_review_them")
    @Expose
    private String yesLetMeReviewThem;
    @SerializedName("no_they_are_realistic")
    @Expose
    private String noTheyAreRealistic;
    @SerializedName("messenger_Decision_Criteria_Rating_Best_Case")
    @Expose
    private String messengerDecisionCriteriaRatingBestCase;
    @SerializedName("messenger_Decision_Criteria_Rating_Introduction")
    @Expose
    private String messengerDecisionCriteriaRatingIntroduction;
    @SerializedName("messenger_Decision_Criteria_Rating_Smiley_1")
    @Expose
    private String messengerDecisionCriteriaRatingSmiley1;
    @SerializedName("messenger_Decision_Criteria_Rating_Smiley_2")
    @Expose
    private String messengerDecisionCriteriaRatingSmiley2;
    @SerializedName("messenger_Decision_Criteria_Rating_Smiley_3")
    @Expose
    private String messengerDecisionCriteriaRatingSmiley3;
    @SerializedName("messenger_Decision_Criteria_Rating_Smiley_4")
    @Expose
    private String messengerDecisionCriteriaRatingSmiley4;
    @SerializedName("messenger_Decision_Criteria_Rating_Smiley_5")
    @Expose
    private String messengerDecisionCriteriaRatingSmiley5;
    @SerializedName("messenger_Decision_Criteria_Rating_Worst_Case")
    @Expose
    private String messengerDecisionCriteriaRatingWorstCase;
    @SerializedName("messenger_Define_Decision_Criteria_Question")
    @Expose
    private String messengerDefineDecisionCriteriaQuestion;
    @SerializedName("messenger_Define_Decision_Criteria_Question_Option1")
    @Expose
    private String messengerDefineDecisionCriteriaQuestionOption1;
    @SerializedName("messenger_Define_Decision_Criteria_Question_Option2")
    @Expose
    private String messengerDefineDecisionCriteriaQuestionOption2;
    @SerializedName("messenger_Define_Decision_Criteria_Question_Option3")
    @Expose
    private String messengerDefineDecisionCriteriaQuestionOption3;
    @SerializedName("messenger_Define_Decision_Criteria_Title")
    @Expose
    private String messengerDefineDecisionCriteriaTitle;
    @SerializedName("start_over")
    @Expose
    private String startOver;

    @SerializedName("init_chatbot_1")
    @Expose
    private String initChatbot1;

    @SerializedName("init_chatbot_2")
    @Expose
    private String initChatbot2;

    @SerializedName("chat_problem")
    @Expose
    private String chatProblem;
    //////
    @SerializedName("decision_Coach_Feedback_Submitted")
    @Expose
    private String decisionCoachFeedbackSubmitted;
    @SerializedName("decision_Coach_Feedback_Failed")
    @Expose
    private String decisionCoachFeedbackFailed;
    @SerializedName("submit_HDM_Feedback_do_you_like_hdm")
    @Expose
    private String submitHDMFeedbackDoYouLikeHDM;
    @SerializedName("submit_HDM_Feedback_thank_you_for_the_feedback")
    @Expose
    private String submitHDMFeedbackThankYouForTheFeedback;
    @SerializedName("submit_HDM_Feedback_mind_me_give_some_comments")
    @Expose
    private String submitHDMFeedbackMindMeGiveSomeComments;
    @SerializedName("submit_HDM_Feedback_it_will_really_helpful")
    @Expose
    private String submitHDMFeedbackItWillReallyHelpful;
    @SerializedName("submit_HDM_Feedback_remind_me_later")
    @Expose
    private String submitHDMFeedbackRemindMeLater;
    @SerializedName("submit_HDM_Feedback_no_thanks")
    @Expose
    private String submitHDMFeedbackNoThanks;
    @SerializedName("submit_HDM_Feedback_please_provide_comment_feedback")
    @Expose
    private String submitHDMFeedbackPleaseProvideCommentFeedback;
    @SerializedName("hdM_Coach_dont_remind_me_again")
    @Expose
    private String hdMCoachDontRemindMeAgain;
    @SerializedName("hdM_Coach_currently_have_viewer_license")
    @Expose
    private String hdMCoachCurrentlyHaveViewerLicense;
    @SerializedName("hdM_Coach_currently_have_viewer_license_thanks")
    @Expose
    private String hdMCoachCurrentlyHaveViewerLicenseThanks;
    @SerializedName("hdM_Coach_thanks")
    @Expose
    private String hdMCoachThanks;
    @SerializedName("showcase_show_me_around")
    @Expose
    private String showcaseShowMeAround;
    @SerializedName("showcase_show_me_around_option_one")
    @Expose
    private String showcaseShowMeAroundOptionOne;
    @SerializedName("showcase_show_me_around_option_two")
    @Expose
    private String showcaseShowMeAroundOptionTwo;
    @SerializedName("showcase_show_me_around_ok")
    @Expose
    private String showcaseShowMeAroundOK;
    @SerializedName("showcase_show_me_around_later")
    @Expose
    private String showcaseShowMeAroundLater;

    //---

    @SerializedName("decision_Criteria_My_Own")
    @Expose
    private String decisionCriteriaMyOwn;
    @SerializedName("decision_Criteria_Other")
    @Expose
    private String decisionCriteriaOther;
    @SerializedName("decision_Criteria_Ratings_Validation_Message")
    @Expose
    private String decisionCriteriaRatingsValidationMessage;

    @SerializedName("qpcc_chat_change")
    @Expose
    private String qpccChatChange;

    @SerializedName("qpcc_chat_no_change")
    @Expose

    private String qpccChatNoChange;
    @SerializedName("step_3_a_title")
    @Expose
    private String step3ATitle;
    @SerializedName("step_3_b_title")
    @Expose
    private String step3BTitle;
    @SerializedName("step_4_a_title")
    @Expose
    private String step4ATitle;
    @SerializedName("step_4_b_title")
    @Expose
    private String step4BTitle;
    @SerializedName("step_5_a_title")
    @Expose
    private String step5ATitle;
    @SerializedName("step_5_b_title")
    @Expose
    private String step5BTitle;


    //
    @SerializedName("step_3_Choose_Your_Resolution_Method_Dialog_Title")
    @Expose
    private String step3ChooseYourResolutionMethodDialogTitle;



    public String getDecisionCriteriaMyOwn() {
        return decisionCriteriaMyOwn;
    }

    public void setDecisionCriteriaMyOwn(String decisionCriteriaMyOwn) {
        this.decisionCriteriaMyOwn = decisionCriteriaMyOwn;
    }

    public String getDecisionCriteriaOther() {
        return decisionCriteriaOther;
    }

    public void setDecisionCriteriaOther(String decisionCriteriaOther) {
        this.decisionCriteriaOther = decisionCriteriaOther;
    }

    public String getDecisionCriteriaRatingsValidationMessage() {
        return decisionCriteriaRatingsValidationMessage;
    }

    public void setDecisionCriteriaRatingsValidationMessage(String decisionCriteriaRatingsValidationMessage) {
        this.decisionCriteriaRatingsValidationMessage = decisionCriteriaRatingsValidationMessage;
    }

    public String getQpccChatChange() {
        return qpccChatChange;
    }

    public void setQpccChatChange(String qpccChatChange) {
        this.qpccChatChange = qpccChatChange;
    }

    public String getQpccChatNoChange() {
        return qpccChatNoChange;
    }

    public void setQpccChatNoChange(String qpccChatNoChange) {
        this.qpccChatNoChange = qpccChatNoChange;
    }

    public String getStep3ATitle() {
        return step3ATitle;
    }

    public void setStep3ATitle(String step3ATitle) {
        this.step3ATitle = step3ATitle;
    }

    public String getStep3BTitle() {
        return step3BTitle;
    }

    public void setStep3BTitle(String step3BTitle) {
        this.step3BTitle = step3BTitle;
    }

    public String getStep4ATitle() {
        return step4ATitle;
    }

    public void setStep4ATitle(String step4ATitle) {
        this.step4ATitle = step4ATitle;
    }

    public String getStep4BTitle() {
        return step4BTitle;
    }

    public void setStep4BTitle(String step4BTitle) {
        this.step4BTitle = step4BTitle;
    }

    public String getStep5ATitle() {
        return step5ATitle;
    }

    public void setStep5ATitle(String step5ATitle) {
        this.step5ATitle = step5ATitle;
    }

    public String getStep5BTitle() {
        return step5BTitle;
    }

    public void setStep5BTitle(String step5BTitle) {
        this.step5BTitle = step5BTitle;
    }

    //---

    public String getChatProblem() {
        return chatProblem;
    }

    public void setChatProblem(String chatProblem) {
        this.chatProblem = chatProblem;
    }

    public String getInitChatbot1() {
        return initChatbot1;
    }

    public void setInitChatbot1(String initChatbot1) {
        this.initChatbot1 = initChatbot1;
    }

    public String getInitChatbot2() {
        return initChatbot2;
    }

    public void setInitChatbot2(String initChatbot2) {
        this.initChatbot2 = initChatbot2;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public String getHdmLikeDislikeFeedback() {
        return hdmLikeDislikeFeedback;
    }

    public void setHdmLikeDislikeFeedback(String hdmLikeDislikeFeedback) {
        this.hdmLikeDislikeFeedback = hdmLikeDislikeFeedback;
    }

    public String getInsightStep11() {
        return insightStep11;
    }

    public void setInsightStep11(String insightStep11) {
        this.insightStep11 = insightStep11;
    }

    public String getInsightStep12() {
        return insightStep12;
    }

    public void setInsightStep12(String insightStep12) {
        this.insightStep12 = insightStep12;
    }

    public String getInsightStep2A() {
        return insightStep2A;
    }

    public void setInsightStep2A(String insightStep2A) {
        this.insightStep2A = insightStep2A;
    }

    public String getInsightStep2ACheck1() {
        return insightStep2ACheck1;
    }

    public void setInsightStep2ACheck1(String insightStep2ACheck1) {
        this.insightStep2ACheck1 = insightStep2ACheck1;
    }

    public String getInsightStep2ACheck2() {
        return insightStep2ACheck2;
    }

    public void setInsightStep2ACheck2(String insightStep2ACheck2) {
        this.insightStep2ACheck2 = insightStep2ACheck2;
    }

    public String getInsightStep2ACheck21() {
        return insightStep2ACheck21;
    }

    public void setInsightStep2ACheck21(String insightStep2ACheck21) {
        this.insightStep2ACheck21 = insightStep2ACheck21;
    }

    public String getInsightStep2ACheck22() {
        return insightStep2ACheck22;
    }

    public void setInsightStep2ACheck22(String insightStep2ACheck22) {
        this.insightStep2ACheck22 = insightStep2ACheck22;
    }

    public String getLetMeEditThem() {
        return letMeEditThem;
    }

    public void setLetMeEditThem(String letMeEditThem) {
        this.letMeEditThem = letMeEditThem;
    }

    public String getTheyAreUniqueAndImportant() {
        return theyAreUniqueAndImportant;
    }

    public void setTheyAreUniqueAndImportant(String theyAreUniqueAndImportant) {
        this.theyAreUniqueAndImportant = theyAreUniqueAndImportant;
    }

    public String getYesLetMeReviewThem() {
        return yesLetMeReviewThem;
    }

    public void setYesLetMeReviewThem(String yesLetMeReviewThem) {
        this.yesLetMeReviewThem = yesLetMeReviewThem;
    }

    public String getNoTheyAreRealistic() {
        return noTheyAreRealistic;
    }

    public void setNoTheyAreRealistic(String noTheyAreRealistic) {
        this.noTheyAreRealistic = noTheyAreRealistic;
    }

    public String getMessengerDecisionCriteriaRatingBestCase() {
        return messengerDecisionCriteriaRatingBestCase;
    }

    public void setMessengerDecisionCriteriaRatingBestCase(String messengerDecisionCriteriaRatingBestCase) {
        this.messengerDecisionCriteriaRatingBestCase = messengerDecisionCriteriaRatingBestCase;
    }

    public String getMessengerDecisionCriteriaRatingIntroduction() {
        return messengerDecisionCriteriaRatingIntroduction;
    }

    public void setMessengerDecisionCriteriaRatingIntroduction(String messengerDecisionCriteriaRatingIntroduction) {
        this.messengerDecisionCriteriaRatingIntroduction = messengerDecisionCriteriaRatingIntroduction;
    }

    public String getMessengerDecisionCriteriaRatingSmiley1() {
        return messengerDecisionCriteriaRatingSmiley1;
    }

    public void setMessengerDecisionCriteriaRatingSmiley1(String messengerDecisionCriteriaRatingSmiley1) {
        this.messengerDecisionCriteriaRatingSmiley1 = messengerDecisionCriteriaRatingSmiley1;
    }

    public String getMessengerDecisionCriteriaRatingSmiley2() {
        return messengerDecisionCriteriaRatingSmiley2;
    }

    public void setMessengerDecisionCriteriaRatingSmiley2(String messengerDecisionCriteriaRatingSmiley2) {
        this.messengerDecisionCriteriaRatingSmiley2 = messengerDecisionCriteriaRatingSmiley2;
    }

    public String getMessengerDecisionCriteriaRatingSmiley3() {
        return messengerDecisionCriteriaRatingSmiley3;
    }

    public void setMessengerDecisionCriteriaRatingSmiley3(String messengerDecisionCriteriaRatingSmiley3) {
        this.messengerDecisionCriteriaRatingSmiley3 = messengerDecisionCriteriaRatingSmiley3;
    }

    public String getMessengerDecisionCriteriaRatingSmiley4() {
        return messengerDecisionCriteriaRatingSmiley4;
    }

    public void setMessengerDecisionCriteriaRatingSmiley4(String messengerDecisionCriteriaRatingSmiley4) {
        this.messengerDecisionCriteriaRatingSmiley4 = messengerDecisionCriteriaRatingSmiley4;
    }

    public String getMessengerDecisionCriteriaRatingSmiley5() {
        return messengerDecisionCriteriaRatingSmiley5;
    }

    public void setMessengerDecisionCriteriaRatingSmiley5(String messengerDecisionCriteriaRatingSmiley5) {
        this.messengerDecisionCriteriaRatingSmiley5 = messengerDecisionCriteriaRatingSmiley5;
    }

    public String getMessengerDecisionCriteriaRatingWorstCase() {
        return messengerDecisionCriteriaRatingWorstCase;
    }

    public void setMessengerDecisionCriteriaRatingWorstCase(String messengerDecisionCriteriaRatingWorstCase) {
        this.messengerDecisionCriteriaRatingWorstCase = messengerDecisionCriteriaRatingWorstCase;
    }

    public String getMessengerDefineDecisionCriteriaQuestion() {
        return messengerDefineDecisionCriteriaQuestion;
    }

    public void setMessengerDefineDecisionCriteriaQuestion(String messengerDefineDecisionCriteriaQuestion) {
        this.messengerDefineDecisionCriteriaQuestion = messengerDefineDecisionCriteriaQuestion;
    }

    public String getMessengerDefineDecisionCriteriaQuestionOption1() {
        return messengerDefineDecisionCriteriaQuestionOption1;
    }

    public void setMessengerDefineDecisionCriteriaQuestionOption1(String messengerDefineDecisionCriteriaQuestionOption1) {
        this.messengerDefineDecisionCriteriaQuestionOption1 = messengerDefineDecisionCriteriaQuestionOption1;
    }

    public String getMessengerDefineDecisionCriteriaQuestionOption2() {
        return messengerDefineDecisionCriteriaQuestionOption2;
    }

    public void setMessengerDefineDecisionCriteriaQuestionOption2(String messengerDefineDecisionCriteriaQuestionOption2) {
        this.messengerDefineDecisionCriteriaQuestionOption2 = messengerDefineDecisionCriteriaQuestionOption2;
    }

    public String getMessengerDefineDecisionCriteriaQuestionOption3() {
        return messengerDefineDecisionCriteriaQuestionOption3;
    }

    public void setMessengerDefineDecisionCriteriaQuestionOption3(String messengerDefineDecisionCriteriaQuestionOption3) {
        this.messengerDefineDecisionCriteriaQuestionOption3 = messengerDefineDecisionCriteriaQuestionOption3;
    }

    public String getMessengerDefineDecisionCriteriaTitle() {
        return messengerDefineDecisionCriteriaTitle;
    }

    public void setMessengerDefineDecisionCriteriaTitle(String messengerDefineDecisionCriteriaTitle) {
        this.messengerDefineDecisionCriteriaTitle = messengerDefineDecisionCriteriaTitle;
    }

    public String getStartOver() {
        return startOver;
    }

    public void setStartOver(String startOver) {
        this.startOver = startOver;
    }

    public String getDefineDecisionCriteriaDecisionTypeQuestion() {
        return defineDecisionCriteriaDecisionTypeQuestion;
    }

    public void setDefineDecisionCriteriaDecisionTypeQuestion(String defineDecisionCriteriaDecisionTypeQuestion) {
        this.defineDecisionCriteriaDecisionTypeQuestion = defineDecisionCriteriaDecisionTypeQuestion;
    }

    public String getDecisionCriteriaPERMAHHelpTitle() {
        return decisionCriteriaPERMAHHelpTitle;
    }

    public void setDecisionCriteriaPERMAHHelpTitle(String decisionCriteriaPERMAHHelpTitle) {
        this.decisionCriteriaPERMAHHelpTitle = decisionCriteriaPERMAHHelpTitle;
    }

    public String getLabelAdd() {
        return labelAdd;
    }

    public void setLabelAdd(String labelAdd) {
        this.labelAdd = labelAdd;
    }

    public String getSharingDialogDoYouWantToShareThisDecision() {
        return sharingDialogDoYouWantToShareThisDecision;
    }

    public void setSharingDialogDoYouWantToShareThisDecision(String sharingDialogDoYouWantToShareThisDecision) {
        this.sharingDialogDoYouWantToShareThisDecision = sharingDialogDoYouWantToShareThisDecision;
    }

    public String getSharingDecisionErrorMessage() {
        return sharingDecisionErrorMessage;
    }

    public void setSharingDecisionErrorMessage(String sharingDecisionErrorMessage) {
        this.sharingDecisionErrorMessage = sharingDecisionErrorMessage;
    }

    public String getSharedUserDidNotBlamingMessage() {
        return sharedUserDidNotBlamingMessage;
    }

    public void setSharedUserDidNotBlamingMessage(String sharedUserDidNotBlamingMessage) {
        this.sharedUserDidNotBlamingMessage = sharedUserDidNotBlamingMessage;
    }

    public String getBlamingAnalysisDialog() {
        return blamingAnalysisDialog;
    }

    public void setBlamingAnalysisDialog(String blamingAnalysisDialog) {
        this.blamingAnalysisDialog = blamingAnalysisDialog;
    }

    public String getLableAuthorOfThisDecision() {
        return lableAuthorOfThisDecision;
    }

    public void setLableAuthorOfThisDecision(String lableAuthorOfThisDecision) {
        this.lableAuthorOfThisDecision = lableAuthorOfThisDecision;
    }

    public String getLableAnonymousUser() {
        return lableAnonymousUser;
    }

    public void setLableAnonymousUser(String lableAnonymousUser) {
        this.lableAnonymousUser = lableAnonymousUser;
    }

    public String getSubmitToCommunityAfterCompletingEachStepDialogBtnNoThanks() {
        return submitToCommunityAfterCompletingEachStepDialogBtnNoThanks;
    }

    public void setSubmitToCommunityAfterCompletingEachStepDialogBtnNoThanks(String submitToCommunityAfterCompletingEachStepDialogBtnNoThanks) {
        this.submitToCommunityAfterCompletingEachStepDialogBtnNoThanks = submitToCommunityAfterCompletingEachStepDialogBtnNoThanks;
    }

    public String getSubmitToCommunityNoThanksConfirmationDialogBtnNo() {
        return submitToCommunityNoThanksConfirmationDialogBtnNo;
    }

    public void setSubmitToCommunityNoThanksConfirmationDialogBtnNo(String submitToCommunityNoThanksConfirmationDialogBtnNo) {
        this.submitToCommunityNoThanksConfirmationDialogBtnNo = submitToCommunityNoThanksConfirmationDialogBtnNo;
    }

    public String getSubmitToCommunityNoThanksConfirmationDialogBtnYes() {
        return submitToCommunityNoThanksConfirmationDialogBtnYes;
    }

    public void setSubmitToCommunityNoThanksConfirmationDialogBtnYes(String submitToCommunityNoThanksConfirmationDialogBtnYes) {
        this.submitToCommunityNoThanksConfirmationDialogBtnYes = submitToCommunityNoThanksConfirmationDialogBtnYes;
    }

    public String getSubmitToCommunityNoThanksConfirmationDialogText() {
        return submitToCommunityNoThanksConfirmationDialogText;
    }

    public void setSubmitToCommunityNoThanksConfirmationDialogText(String submitToCommunityNoThanksConfirmationDialogText) {
        this.submitToCommunityNoThanksConfirmationDialogText = submitToCommunityNoThanksConfirmationDialogText;
    }


    public String getSubmitToCommunityAfterCompletingEachStepDialogText() {
        return submitToCommunityAfterCompletingEachStepDialogText;
    }

    public void setSubmitToCommunityAfterCompletingEachStepDialogText(String submitToCommunityAfterCompletingEachStepDialogText) {
        this.submitToCommunityAfterCompletingEachStepDialogText = submitToCommunityAfterCompletingEachStepDialogText;
    }

    public String getSubmitToCommunityAfterCompletingEachStepDialogBtnAnonymous() {
        return submitToCommunityAfterCompletingEachStepDialogBtnAnonymous;
    }

    public void setSubmitToCommunityAfterCompletingEachStepDialogBtnAnonymous(String submitToCommunityAfterCompletingEachStepDialogBtnAnonymous) {
        this.submitToCommunityAfterCompletingEachStepDialogBtnAnonymous = submitToCommunityAfterCompletingEachStepDialogBtnAnonymous;
    }

    public String getSubmitToCommunityAfterCompletingEachStepDialogBtnTakeCredit() {
        return submitToCommunityAfterCompletingEachStepDialogBtnTakeCredit;
    }

    public void setSubmitToCommunityAfterCompletingEachStepDialogBtnTakeCredit(String submitToCommunityAfterCompletingEachStepDialogBtnTakeCredit) {
        this.submitToCommunityAfterCompletingEachStepDialogBtnTakeCredit = submitToCommunityAfterCompletingEachStepDialogBtnTakeCredit;
    }

    public String getStep1TheWhyTitle() {
        return step1TheWhyTitle;
    }

    public void setStep1TheWhyTitle(String step1TheWhyTitle) {
        this.step1TheWhyTitle = step1TheWhyTitle;
    }

    public String getStep1TheWhatTitle() {
        return step1TheWhatTitle;
    }

    public void setStep1TheWhatTitle(String step1TheWhatTitle) {
        this.step1TheWhatTitle = step1TheWhatTitle;
    }

    public String getStep1TheHowWorkTitle() {
        return step1TheHowWorkTitle;
    }

    public void setStep1TheHowWorkTitle(String step1TheHowWorkTitle) {
        this.step1TheHowWorkTitle = step1TheHowWorkTitle;
    }

    public String getStep1TheHowHomeTitle() {
        return step1TheHowHomeTitle;
    }

    public void setStep1TheHowHomeTitle(String step1TheHowHomeTitle) {
        this.step1TheHowHomeTitle = step1TheHowHomeTitle;
    }

    public String getStep2ATheWhyTitle() {
        return step2ATheWhyTitle;
    }

    public void setStep2ATheWhyTitle(String step2ATheWhyTitle) {
        this.step2ATheWhyTitle = step2ATheWhyTitle;
    }

    public String getStep2ATheWhatTitle() {
        return step2ATheWhatTitle;
    }

    public void setStep2ATheWhatTitle(String step2ATheWhatTitle) {
        this.step2ATheWhatTitle = step2ATheWhatTitle;
    }

    public String getStep2ATheHowWorkTitle() {
        return step2ATheHowWorkTitle;
    }

    public void setStep2ATheHowWorkTitle(String step2ATheHowWorkTitle) {
        this.step2ATheHowWorkTitle = step2ATheHowWorkTitle;
    }

    public String getStep2ATheHowHomeTitle() {
        return step2ATheHowHomeTitle;
    }

    public void setStep2ATheHowHomeTitle(String step2ATheHowHomeTitle) {
        this.step2ATheHowHomeTitle = step2ATheHowHomeTitle;
    }

    public String getStep2BTheWhyTitle() {
        return step2BTheWhyTitle;
    }

    public void setStep2BTheWhyTitle(String step2BTheWhyTitle) {
        this.step2BTheWhyTitle = step2BTheWhyTitle;
    }

    public String getStep2BTheWhatTitle() {
        return step2BTheWhatTitle;
    }

    public void setStep2BTheWhatTitle(String step2BTheWhatTitle) {
        this.step2BTheWhatTitle = step2BTheWhatTitle;
    }

    public String getStep2BTheHowWorkTitle() {
        return step2BTheHowWorkTitle;
    }

    public void setStep2BTheHowWorkTitle(String step2BTheHowWorkTitle) {
        this.step2BTheHowWorkTitle = step2BTheHowWorkTitle;
    }

    public String getStep2BTheHowHomeTitle() {
        return step2BTheHowHomeTitle;
    }

    public void setStep2BTheHowHomeTitle(String step2BTheHowHomeTitle) {
        this.step2BTheHowHomeTitle = step2BTheHowHomeTitle;
    }

    public String getStep3TheWhyTitle() {
        return step3TheWhyTitle;
    }

    public void setStep3TheWhyTitle(String step3TheWhyTitle) {
        this.step3TheWhyTitle = step3TheWhyTitle;
    }

    public String getStep3TheWhatTitle() {
        return step3TheWhatTitle;
    }

    public void setStep3TheWhatTitle(String step3TheWhatTitle) {
        this.step3TheWhatTitle = step3TheWhatTitle;
    }

    public String getStep3TheHowTitle() {
        return step3TheHowTitle;
    }

    public void setStep3TheHowTitle(String step3TheHowTitle) {
        this.step3TheHowTitle = step3TheHowTitle;
    }

    public String getStep4TheWhyTitle() {
        return step4TheWhyTitle;
    }

    public void setStep4TheWhyTitle(String step4TheWhyTitle) {
        this.step4TheWhyTitle = step4TheWhyTitle;
    }

    public String getStep4TheWhatTitle() {
        return step4TheWhatTitle;
    }

    public void setStep4TheWhatTitle(String step4TheWhatTitle) {
        this.step4TheWhatTitle = step4TheWhatTitle;
    }

    public String getStep4TheHowWorkTitle() {
        return step4TheHowWorkTitle;
    }

    public void setStep4TheHowWorkTitle(String step4TheHowWorkTitle) {
        this.step4TheHowWorkTitle = step4TheHowWorkTitle;
    }

    public String getStep4TheHowHomeTitle() {
        return step4TheHowHomeTitle;
    }

    public void setStep4TheHowHomeTitle(String step4TheHowHomeTitle) {
        this.step4TheHowHomeTitle = step4TheHowHomeTitle;
    }

    public String getStep5TheWhyTitle() {
        return step5TheWhyTitle;
    }

    public void setStep5TheWhyTitle(String step5TheWhyTitle) {
        this.step5TheWhyTitle = step5TheWhyTitle;
    }

    public String getStep5TheWhatTitle() {
        return step5TheWhatTitle;
    }

    public void setStep5TheWhatTitle(String step5TheWhatTitle) {
        this.step5TheWhatTitle = step5TheWhatTitle;
    }

    public String getStep5TheHowWorkTitle() {
        return step5TheHowWorkTitle;
    }

    public void setStep5TheHowWorkTitle(String step5TheHowWorkTitle) {
        this.step5TheHowWorkTitle = step5TheHowWorkTitle;
    }

    public String getStep5TheHowHomeTitle() {
        return step5TheHowHomeTitle;
    }

    public void setStep5TheHowHomeTitle(String step5TheHowHomeTitle) {
        this.step5TheHowHomeTitle = step5TheHowHomeTitle;
    }

    public String getJustDoItTheWhyTitle() {
        return justDoItTheWhyTitle;
    }

    public void setJustDoItTheWhyTitle(String justDoItTheWhyTitle) {
        this.justDoItTheWhyTitle = justDoItTheWhyTitle;
    }

    public String getJustDoItTheWhatTitle() {
        return justDoItTheWhatTitle;
    }

    public void setJustDoItTheWhatTitle(String justDoItTheWhatTitle) {
        this.justDoItTheWhatTitle = justDoItTheWhatTitle;
    }

    public String getJustDoItTheHowWorkTitle() {
        return justDoItTheHowWorkTitle;
    }

    public void setJustDoItTheHowWorkTitle(String justDoItTheHowWorkTitle) {
        this.justDoItTheHowWorkTitle = justDoItTheHowWorkTitle;
    }

    public String getJustDoItTheHowHomeTitle() {
        return justDoItTheHowHomeTitle;
    }

    public void setJustDoItTheHowHomeTitle(String justDoItTheHowHomeTitle) {
        this.justDoItTheHowHomeTitle = justDoItTheHowHomeTitle;
    }

    public String getStep31TheWhyTitle() {
        return step31TheWhyTitle;
    }

    public void setStep31TheWhyTitle(String step31TheWhyTitle) {
        this.step31TheWhyTitle = step31TheWhyTitle;
    }

    public String getStep31TheWhatTitle() {
        return step31TheWhatTitle;
    }

    public void setStep31TheWhatTitle(String step31TheWhatTitle) {
        this.step31TheWhatTitle = step31TheWhatTitle;
    }

    public String getStep31TheHowWorkTitle() {
        return step31TheHowWorkTitle;
    }

    public void setStep31TheHowWorkTitle(String step31TheHowWorkTitle) {
        this.step31TheHowWorkTitle = step31TheHowWorkTitle;
    }

    public String getStep31TheHowHomeTitle() {
        return step31TheHowHomeTitle;
    }

    public void setStep31TheHowHomeTitle(String step31TheHowHomeTitle) {
        this.step31TheHowHomeTitle = step31TheHowHomeTitle;
    }

    public String getStep32TheWhyTitle() {
        return step32TheWhyTitle;
    }

    public void setStep32TheWhyTitle(String step32TheWhyTitle) {
        this.step32TheWhyTitle = step32TheWhyTitle;
    }

    public String getStep32TheWhatTitle() {
        return step32TheWhatTitle;
    }

    public void setStep32TheWhatTitle(String step32TheWhatTitle) {
        this.step32TheWhatTitle = step32TheWhatTitle;
    }

    public String getStep32TheHowWorkTitle() {
        return step32TheHowWorkTitle;
    }

    public void setStep32TheHowWorkTitle(String step32TheHowWorkTitle) {
        this.step32TheHowWorkTitle = step32TheHowWorkTitle;
    }

    public String getStep32TheHowHomeTitle() {
        return step32TheHowHomeTitle;
    }

    public void setStep32TheHowHomeTitle(String step32TheHowHomeTitle) {
        this.step32TheHowHomeTitle = step32TheHowHomeTitle;
    }

    public String getStep33TheWhyTitle() {
        return step33TheWhyTitle;
    }

    public void setStep33TheWhyTitle(String step33TheWhyTitle) {
        this.step33TheWhyTitle = step33TheWhyTitle;
    }

    public String getStep33TheWhatTitle() {
        return step33TheWhatTitle;
    }

    public void setStep33TheWhatTitle(String step33TheWhatTitle) {
        this.step33TheWhatTitle = step33TheWhatTitle;
    }

    public String getStep33TheHowWorkTitle() {
        return step33TheHowWorkTitle;
    }

    public void setStep33TheHowWorkTitle(String step33TheHowWorkTitle) {
        this.step33TheHowWorkTitle = step33TheHowWorkTitle;
    }

    public String getStep33TheHowHomeTitle() {
        return step33TheHowHomeTitle;
    }

    public void setStep33TheHowHomeTitle(String step33TheHowHomeTitle) {
        this.step33TheHowHomeTitle = step33TheHowHomeTitle;
    }

    public String getStep34TheWhyTitle() {
        return step34TheWhyTitle;
    }

    public void setStep34TheWhyTitle(String step34TheWhyTitle) {
        this.step34TheWhyTitle = step34TheWhyTitle;
    }

    public String getStep34TheWhatTitle() {
        return step34TheWhatTitle;
    }

    public void setStep34TheWhatTitle(String step34TheWhatTitle) {
        this.step34TheWhatTitle = step34TheWhatTitle;
    }

    public String getStep34TheHowWorkTitle() {
        return step34TheHowWorkTitle;
    }

    public void setStep34TheHowWorkTitle(String step34TheHowWorkTitle) {
        this.step34TheHowWorkTitle = step34TheHowWorkTitle;
    }

    public String getStep34TheHowHomeTitle() {
        return step34TheHowHomeTitle;
    }

    public void setStep34TheHowHomeTitle(String step34TheHowHomeTitle) {
        this.step34TheHowHomeTitle = step34TheHowHomeTitle;
    }

    public String getStep35TheWhyTitle() {
        return step35TheWhyTitle;
    }

    public void setStep35TheWhyTitle(String step35TheWhyTitle) {
        this.step35TheWhyTitle = step35TheWhyTitle;
    }

    public String getStep35TheWhatTitle() {
        return step35TheWhatTitle;
    }

    public void setStep35TheWhatTitle(String step35TheWhatTitle) {
        this.step35TheWhatTitle = step35TheWhatTitle;
    }

    public String getStep35TheHowTitle() {
        return step35TheHowTitle;
    }

    public void setStep35TheHowTitle(String step35TheHowTitle) {
        this.step35TheHowTitle = step35TheHowTitle;
    }

    public String getStep35TheWhat() {
        return step35TheWhat;
    }

    public void setStep35TheWhat(String step35TheWhat) {
        this.step35TheWhat = step35TheWhat;
    }


    public String getWordRuleTypePlanning() {
        return wordRuleTypePlanning;
    }

    public void setWordRuleTypePlanning(String wordRuleTypePlanning) {
        this.wordRuleTypePlanning = wordRuleTypePlanning;
    }

    public String getSignUpSuccess() {
        return signUpSuccess;
    }

    public void setSignUpSuccess(String signUpSuccess) {
        this.signUpSuccess = signUpSuccess;
    }

    public String getPasswordChangeSuccess() {
        return passwordChangeSuccess;
    }

    public void setPasswordChangeSuccess(String passwordChangeSuccess) {
        this.passwordChangeSuccess = passwordChangeSuccess;
    }

    public String getProfileUpdateSuccess() {
        return profileUpdateSuccess;
    }

    public void setProfileUpdateSuccess(String profileUpdateSuccess) {
        this.profileUpdateSuccess = profileUpdateSuccess;
    }

    public String getForgetPasswordSuccess() {
        return forgetPasswordSuccess;
    }

    public void setForgetPasswordSuccess(String forgetPasswordSuccess) {
        this.forgetPasswordSuccess = forgetPasswordSuccess;
    }

    public String getWrongCredentials() {
        return wrongCredentials;
    }

    public void setWrongCredentials(String wrongCredentials) {
        this.wrongCredentials = wrongCredentials;
    }

    public String getFingerPrintSuccess() {
        return fingerPrintSuccess;
    }

    public void setFingerPrintSuccess(String fingerPrintSuccess) {
        this.fingerPrintSuccess = fingerPrintSuccess;
    }

    public String getIncorrectFingerPrintSuccess() {
        return incorrectFingerPrintSuccess;
    }

    public void setIncorrectFingerPrintSuccess(String incorrectFingerPrintSuccess) {
        this.incorrectFingerPrintSuccess = incorrectFingerPrintSuccess;
    }

    public String getLogoutSuccess() {
        return logoutSuccess;
    }

    public void setLogoutSuccess(String logoutSuccess) {
        this.logoutSuccess = logoutSuccess;
    }

    public String getPrivateShareSuccess() {
        return privateShareSuccess;
    }

    public void setPrivateShareSuccess(String privateShareSuccess) {
        this.privateShareSuccess = privateShareSuccess;
    }

    public String getPrivateShareEmailDeleteSuccess() {
        return privateShareEmailDeleteSuccess;
    }

    public void setPrivateShareEmailDeleteSuccess(String privateShareEmailDeleteSuccess) {
        this.privateShareEmailDeleteSuccess = privateShareEmailDeleteSuccess;
    }

    public String getBulkShareSuccess() {
        return bulkShareSuccess;
    }

    public void setBulkShareSuccess(String bulkShareSuccess) {
        this.bulkShareSuccess = bulkShareSuccess;
    }

    public String getWantAnonymousShare() {
        return wantAnonymousShare;
    }

    public void setWantAnonymousShare(String wantAnonymousShare) {
        this.wantAnonymousShare = wantAnonymousShare;
    }

    public String getLockedDecisionForOthers() {
        return lockedDecisionForOthers;
    }

    public void setLockedDecisionForOthers(String lockedDecisionForOthers) {
        this.lockedDecisionForOthers = lockedDecisionForOthers;
    }

    public String getWarningMessageForViewOnlyMode() {
        return warningMessageForViewOnlyMode;
    }

    public void setWarningMessageForViewOnlyMode(String warningMessageForViewOnlyMode) {
        this.warningMessageForViewOnlyMode = warningMessageForViewOnlyMode;
    }

    public String getWantUnLockedDecisionByOwner() {
        return wantUnLockedDecisionByOwner;
    }

    public void setWantUnLockedDecisionByOwner(String wantUnLockedDecisionByOwner) {
        this.wantUnLockedDecisionByOwner = wantUnLockedDecisionByOwner;
    }

    public String getCreateNewDecision() {
        return createNewDecision;
    }

    public void setCreateNewDecision(String createNewDecision) {
        this.createNewDecision = createNewDecision;
    }

    public String getPromptForDeleteDecision() {
        return promptForDeleteDecision;
    }

    public void setPromptForDeleteDecision(String promptForDeleteDecision) {
        this.promptForDeleteDecision = promptForDeleteDecision;
    }

    public String getPromptForUnshareDecision() {
        return promptForUnshareDecision;
    }

    public void setPromptForUnshareDecision(String promptForUnshareDecision) {
        this.promptForUnshareDecision = promptForUnshareDecision;
    }

    public String getRenameDecisionSuccess() {
        return renameDecisionSuccess;
    }

    public void setRenameDecisionSuccess(String renameDecisionSuccess) {
        this.renameDecisionSuccess = renameDecisionSuccess;
    }

    public String getImportDecisionSuccess() {
        return importDecisionSuccess;
    }

    public void setImportDecisionSuccess(String importDecisionSuccess) {
        this.importDecisionSuccess = importDecisionSuccess;
    }

    public String getImportDecisionFromSDCARDSuccess() {
        return importDecisionFromSDCARDSuccess;
    }

    public void setImportDecisionFromSDCARDSuccess(String importDecisionFromSDCARDSuccess) {
        this.importDecisionFromSDCARDSuccess = importDecisionFromSDCARDSuccess;
    }

    public String getImportDecisionFromGoogleDriveSuccess() {
        return importDecisionFromGoogleDriveSuccess;
    }

    public void setImportDecisionFromGoogleDriveSuccess(String importDecisionFromGoogleDriveSuccess) {
        this.importDecisionFromGoogleDriveSuccess = importDecisionFromGoogleDriveSuccess;
    }

    public String getImportDecisionGoogleDriveSuccess() {
        return importDecisionGoogleDriveSuccess;
    }

    public void setImportDecisionGoogleDriveSuccess(String importDecisionGoogleDriveSuccess) {
        this.importDecisionGoogleDriveSuccess = importDecisionGoogleDriveSuccess;
    }

    public String getManualSyncNoDataFound() {
        return manualSyncNoDataFound;
    }

    public void setManualSyncNoDataFound(String manualSyncNoDataFound) {
        this.manualSyncNoDataFound = manualSyncNoDataFound;
    }

    public String getExportDecisionFromSDCARDOrGoogleDriveSuccess() {
        return exportDecisionFromSDCARDOrGoogleDriveSuccess;
    }

    public void setExportDecisionFromSDCARDOrGoogleDriveSuccess(String exportDecisionFromSDCARDOrGoogleDriveSuccess) {
        this.exportDecisionFromSDCARDOrGoogleDriveSuccess = exportDecisionFromSDCARDOrGoogleDriveSuccess;
    }

    public String getWarningStep1And2CompleteBeforeShare() {
        return warningStep1And2CompleteBeforeShare;
    }

    public void setWarningStep1And2CompleteBeforeShare(String warningStep1And2CompleteBeforeShare) {
        this.warningStep1And2CompleteBeforeShare = warningStep1And2CompleteBeforeShare;
    }

    public String getWarningBeforeStep2Complete() {
        return warningBeforeStep2Complete;
    }

    public void setWarningBeforeStep2Complete(String warningBeforeStep2Complete) {
        this.warningBeforeStep2Complete = warningBeforeStep2Complete;
    }

    public String getChooseYourResolutionAlert() {
        return chooseYourResolutionAlert;
    }

    public void setChooseYourResolutionAlert(String chooseYourResolutionAlert) {
        this.chooseYourResolutionAlert = chooseYourResolutionAlert;
    }

    public String getPleaseCheckYourInternetConnection() {
        return pleaseCheckYourInternetConnection;
    }

    public void setPleaseCheckYourInternetConnection(String pleaseCheckYourInternetConnection) {
        this.pleaseCheckYourInternetConnection = pleaseCheckYourInternetConnection;
    }

    public String getPleaseEnterEmail() {
        return pleaseEnterEmail;
    }

    public void setPleaseEnterEmail(String pleaseEnterEmail) {
        this.pleaseEnterEmail = pleaseEnterEmail;
    }

    public String getPleaseEnterName() {
        return pleaseEnterName;
    }

    public void setPleaseEnterName(String pleaseEnterName) {
        this.pleaseEnterName = pleaseEnterName;
    }

    public String getPleaseEnterSurName() {
        return pleaseEnterSurName;
    }

    public void setPleaseEnterSurName(String pleaseEnterSurName) {
        this.pleaseEnterSurName = pleaseEnterSurName;
    }

    public String getPleaseEnterCountry() {
        return pleaseEnterCountry;
    }

    public void setPleaseEnterCountry(String pleaseEnterCountry) {
        this.pleaseEnterCountry = pleaseEnterCountry;
    }

    public String getEmailIdExists() {
        return emailIdExists;
    }

    public void setEmailIdExists(String emailIdExists) {
        this.emailIdExists = emailIdExists;
    }

    public String getSearchResultEmptyMessage() {
        return searchResultEmptyMessage;
    }

    public void setSearchResultEmptyMessage(String searchResultEmptyMessage) {
        this.searchResultEmptyMessage = searchResultEmptyMessage;
    }

    public String getCanNotConnectToITunes() {
        return canNotConnectToITunes;
    }

    public void setCanNotConnectToITunes(String canNotConnectToITunes) {
        this.canNotConnectToITunes = canNotConnectToITunes;
    }

    public String getPleaseEnterValidEmailId() {
        return pleaseEnterValidEmailId;
    }

    public void setPleaseEnterValidEmailId(String pleaseEnterValidEmailId) {
        this.pleaseEnterValidEmailId = pleaseEnterValidEmailId;
    }

    public String getMessageDashboardOffline() {
        return messageDashboardOffline;
    }

    public void setMessageDashboardOffline(String messageDashboardOffline) {
        this.messageDashboardOffline = messageDashboardOffline;
    }

    public String getMessageDashboardOnlyViewAccess() {
        return messageDashboardOnlyViewAccess;
    }

    public void setMessageDashboardOnlyViewAccess(String messageDashboardOnlyViewAccess) {
        this.messageDashboardOnlyViewAccess = messageDashboardOnlyViewAccess;
    }

    public String getMessageDashboardFullAccess() {
        return messageDashboardFullAccess;
    }

    public void setMessageDashboardFullAccess(String messageDashboardFullAccess) {
        this.messageDashboardFullAccess = messageDashboardFullAccess;
    }

    public String getErrorInConnectingToFacebook() {
        return errorInConnectingToFacebook;
    }

    public void setErrorInConnectingToFacebook(String errorInConnectingToFacebook) {
        this.errorInConnectingToFacebook = errorInConnectingToFacebook;
    }

    public String getLoginFailWithGoogle() {
        return loginFailWithGoogle;
    }

    public void setLoginFailWithGoogle(String loginFailWithGoogle) {
        this.loginFailWithGoogle = loginFailWithGoogle;
    }

    public String getDecisionAlreadySharedWithUser() {
        return decisionAlreadySharedWithUser;
    }

    public void setDecisionAlreadySharedWithUser(String decisionAlreadySharedWithUser) {
        this.decisionAlreadySharedWithUser = decisionAlreadySharedWithUser;
    }

    public String getLoginSuccessUsingGoogle() {
        return loginSuccessUsingGoogle;
    }

    public void setLoginSuccessUsingGoogle(String loginSuccessUsingGoogle) {
        this.loginSuccessUsingGoogle = loginSuccessUsingGoogle;
    }

    public String getLoginSuccessUsingFacebook() {
        return loginSuccessUsingFacebook;
    }

    public void setLoginSuccessUsingFacebook(String loginSuccessUsingFacebook) {
        this.loginSuccessUsingFacebook = loginSuccessUsingFacebook;
    }

    public String getTryingShareDecisionWithoutAddingUser() {
        return tryingShareDecisionWithoutAddingUser;
    }

    public void setTryingShareDecisionWithoutAddingUser(String tryingShareDecisionWithoutAddingUser) {
        this.tryingShareDecisionWithoutAddingUser = tryingShareDecisionWithoutAddingUser;
    }

    public String getiOSRestorePurchasesFailure() {
        return iOSRestorePurchasesFailure;
    }

    public void setiOSRestorePurchasesFailure(String iOSRestorePurchasesFailure) {
        this.iOSRestorePurchasesFailure = iOSRestorePurchasesFailure;
    }

    public String getExpiredLicenceWarning() {
        return expiredLicenceWarning;
    }

    public void setExpiredLicenceWarning(String expiredLicenceWarning) {
        this.expiredLicenceWarning = expiredLicenceWarning;
    }

    public String getiOSRestorePurchasesSuccess() {
        return iOSRestorePurchasesSuccess;
    }

    public void setiOSRestorePurchasesSuccess(String iOSRestorePurchasesSuccess) {
        this.iOSRestorePurchasesSuccess = iOSRestorePurchasesSuccess;
    }

    public String getiOSRestorePurchaseNoPurchases() {
        return iOSRestorePurchaseNoPurchases;
    }

    public void setiOSRestorePurchaseNoPurchases(String iOSRestorePurchaseNoPurchases) {
        this.iOSRestorePurchaseNoPurchases = iOSRestorePurchaseNoPurchases;
    }

    public String getiOSBuyLicenseConfirmation() {
        return iOSBuyLicenseConfirmation;
    }

    public void setiOSBuyLicenseConfirmation(String iOSBuyLicenseConfirmation) {
        this.iOSBuyLicenseConfirmation = iOSBuyLicenseConfirmation;
    }

    public String getiOSBuyLicenseFinalMessage() {
        return iOSBuyLicenseFinalMessage;
    }

    public void setiOSBuyLicenseFinalMessage(String iOSBuyLicenseFinalMessage) {
        this.iOSBuyLicenseFinalMessage = iOSBuyLicenseFinalMessage;
    }

    public String getAndroidInAppPurchasePaymentPolicy() {
        return androidInAppPurchasePaymentPolicy;
    }

    public void setAndroidInAppPurchasePaymentPolicy(String androidInAppPurchasePaymentPolicy) {
        this.androidInAppPurchasePaymentPolicy = androidInAppPurchasePaymentPolicy;
    }

    public String getInAppPurchaseTrailPeriodMessage() {
        return inAppPurchaseTrailPeriodMessage;
    }

    public void setInAppPurchaseTrailPeriodMessage(String inAppPurchaseTrailPeriodMessage) {
        this.inAppPurchaseTrailPeriodMessage = inAppPurchaseTrailPeriodMessage;
    }

    public String getInAppPurchaseInstruction() {
        return inAppPurchaseInstruction;
    }

    public void setInAppPurchaseInstruction(String inAppPurchaseInstruction) {
        this.inAppPurchaseInstruction = inAppPurchaseInstruction;
    }

    public String getiOSInAppPurchasePaymentPolicy() {
        return iOSInAppPurchasePaymentPolicy;
    }

    public void setiOSInAppPurchasePaymentPolicy(String iOSInAppPurchasePaymentPolicy) {
        this.iOSInAppPurchasePaymentPolicy = iOSInAppPurchasePaymentPolicy;
    }

    public String getShowcaseTitleCreateNewDecision() {
        return showcaseTitleCreateNewDecision;
    }

    public void setShowcaseTitleCreateNewDecision(String showcaseTitleCreateNewDecision) {
        this.showcaseTitleCreateNewDecision = showcaseTitleCreateNewDecision;
    }

    public String getShowcaseTitleMyDecisions() {
        return showcaseTitleMyDecisions;
    }

    public void setShowcaseTitleMyDecisions(String showcaseTitleMyDecisions) {
        this.showcaseTitleMyDecisions = showcaseTitleMyDecisions;
    }

    public String getShowcaseTitleSharedDecisions() {
        return showcaseTitleSharedDecisions;
    }

    public void setShowcaseTitleSharedDecisions(String showcaseTitleSharedDecisions) {
        this.showcaseTitleSharedDecisions = showcaseTitleSharedDecisions;
    }

    public String getShowcaseTitleCommunityLibrary() {
        return showcaseTitleCommunityLibrary;
    }

    public void setShowcaseTitleCommunityLibrary(String showcaseTitleCommunityLibrary) {
        this.showcaseTitleCommunityLibrary = showcaseTitleCommunityLibrary;
    }

    public String getShowcaseTitleLearningFromEachOther() {
        return showcaseTitleLearningFromEachOther;
    }

    public void setShowcaseTitleLearningFromEachOther(String showcaseTitleLearningFromEachOther) {
        this.showcaseTitleLearningFromEachOther = showcaseTitleLearningFromEachOther;
    }

    public String getShowcaseTitleMessagingInterface() {
        return showcaseTitleMessagingInterface;
    }

    public void setShowcaseTitleMessagingInterface(String showcaseTitleMessagingInterface) {
        this.showcaseTitleMessagingInterface = showcaseTitleMessagingInterface;
    }

    public String getShowcaseTitleShare() {
        return showcaseTitleShare;
    }

    public void setShowcaseTitleShare(String showcaseTitleShare) {
        this.showcaseTitleShare = showcaseTitleShare;
    }

    public String getShowcaseCreateNewDecision() {
        return showcaseCreateNewDecision;
    }

    public void setShowcaseCreateNewDecision(String showcaseCreateNewDecision) {
        this.showcaseCreateNewDecision = showcaseCreateNewDecision;
    }

    public String getShowcaseMyDecisions() {
        return showcaseMyDecisions;
    }

    public void setShowcaseMyDecisions(String showcaseMyDecisions) {
        this.showcaseMyDecisions = showcaseMyDecisions;
    }

    public String getShowcaseSharedDecisions() {
        return showcaseSharedDecisions;
    }

    public void setShowcaseSharedDecisions(String showcaseSharedDecisions) {
        this.showcaseSharedDecisions = showcaseSharedDecisions;
    }

    public String getShowcaseCommunityDecisions() {
        return showcaseCommunityDecisions;
    }

    public void setShowcaseCommunityDecisions(String showcaseCommunityDecisions) {
        this.showcaseCommunityDecisions = showcaseCommunityDecisions;
    }

    public String getShowcaseLearningFromEachOther() {
        return showcaseLearningFromEachOther;
    }

    public void setShowcaseLearningFromEachOther(String showcaseLearningFromEachOther) {
        this.showcaseLearningFromEachOther = showcaseLearningFromEachOther;
    }

    public String getShowcaseMessagingInterface() {
        return showcaseMessagingInterface;
    }

    public void setShowcaseMessagingInterface(String showcaseMessagingInterface) {
        this.showcaseMessagingInterface = showcaseMessagingInterface;
    }

    public String getShowcaseShareButton() {
        return showcaseShareButton;
    }

    public void setShowcaseShareButton(String showcaseShareButton) {
        this.showcaseShareButton = showcaseShareButton;
    }

    public String getBestPracticeDetailsMultilineSeparator() {
        return bestPracticeDetailsMultilineSeparator;
    }

    public void setBestPracticeDetailsMultilineSeparator(String bestPracticeDetailsMultilineSeparator) {
        this.bestPracticeDetailsMultilineSeparator = bestPracticeDetailsMultilineSeparator;
    }

    public String getBestPracticeNecessaryAssumption() {
        return bestPracticeNecessaryAssumption;
    }

    public void setBestPracticeNecessaryAssumption(String bestPracticeNecessaryAssumption) {
        this.bestPracticeNecessaryAssumption = bestPracticeNecessaryAssumption;
    }

    public String getBestPracticeNecessaryAssumptionGapAnalysis() {
        return bestPracticeNecessaryAssumptionGapAnalysis;
    }

    public void setBestPracticeNecessaryAssumptionGapAnalysis(String bestPracticeNecessaryAssumptionGapAnalysis) {
        this.bestPracticeNecessaryAssumptionGapAnalysis = bestPracticeNecessaryAssumptionGapAnalysis;
    }

    public String getBestPracticeParallelAssumptionsForMethods1And2() {
        return bestPracticeParallelAssumptionsForMethods1And2;
    }

    public void setBestPracticeParallelAssumptionsForMethods1And2(String bestPracticeParallelAssumptionsForMethods1And2) {
        this.bestPracticeParallelAssumptionsForMethods1And2 = bestPracticeParallelAssumptionsForMethods1And2;
    }

    public String getBestPracticeParallelAssumptionsForMethods3And4() {
        return bestPracticeParallelAssumptionsForMethods3And4;
    }

    public void setBestPracticeParallelAssumptionsForMethods3And4(String bestPracticeParallelAssumptionsForMethods3And4) {
        this.bestPracticeParallelAssumptionsForMethods3And4 = bestPracticeParallelAssumptionsForMethods3And4;
    }

    public String getBestPracticeParallelAssumptionsForMethodsOption1SimpleResolution() {
        return bestPracticeParallelAssumptionsForMethodsOption1SimpleResolution;
    }

    public void setBestPracticeParallelAssumptionsForMethodsOption1SimpleResolution(String bestPracticeParallelAssumptionsForMethodsOption1SimpleResolution) {
        this.bestPracticeParallelAssumptionsForMethodsOption1SimpleResolution = bestPracticeParallelAssumptionsForMethodsOption1SimpleResolution;
    }

    public String getBestPracticeParallelAssumptionsForMethodsOption2SimpleResolution() {
        return bestPracticeParallelAssumptionsForMethodsOption2SimpleResolution;
    }

    public void setBestPracticeParallelAssumptionsForMethodsOption2SimpleResolution(String bestPracticeParallelAssumptionsForMethodsOption2SimpleResolution) {
        this.bestPracticeParallelAssumptionsForMethodsOption2SimpleResolution = bestPracticeParallelAssumptionsForMethodsOption2SimpleResolution;
    }

    public String getBestPracticeParallelAssumptionsForMethodsOption3SimpleResolution() {
        return bestPracticeParallelAssumptionsForMethodsOption3SimpleResolution;
    }

    public void setBestPracticeParallelAssumptionsForMethodsOption3SimpleResolution(String bestPracticeParallelAssumptionsForMethodsOption3SimpleResolution) {
        this.bestPracticeParallelAssumptionsForMethodsOption3SimpleResolution = bestPracticeParallelAssumptionsForMethodsOption3SimpleResolution;
    }

    public String getBestPracticeParallelAssumptionsForMethodsOption4SimpleResolution() {
        return bestPracticeParallelAssumptionsForMethodsOption4SimpleResolution;
    }

    public void setBestPracticeParallelAssumptionsForMethodsOption4SimpleResolution(String bestPracticeParallelAssumptionsForMethodsOption4SimpleResolution) {
        this.bestPracticeParallelAssumptionsForMethodsOption4SimpleResolution = bestPracticeParallelAssumptionsForMethodsOption4SimpleResolution;
    }

    public String getBestPracticeParallelAssumptionsYesBut() {
        return bestPracticeParallelAssumptionsYesBut;
    }

    public void setBestPracticeParallelAssumptionsYesBut(String bestPracticeParallelAssumptionsYesBut) {
        this.bestPracticeParallelAssumptionsYesBut = bestPracticeParallelAssumptionsYesBut;
    }

    public String getBestPracticeStrategy() {
        return bestPracticeStrategy;
    }

    public void setBestPracticeStrategy(String bestPracticeStrategy) {
        this.bestPracticeStrategy = bestPracticeStrategy;
    }

    public String getBestPracticeSufficiencyAssumptions() {
        return bestPracticeSufficiencyAssumptions;
    }

    public void setBestPracticeSufficiencyAssumptions(String bestPracticeSufficiencyAssumptions) {
        this.bestPracticeSufficiencyAssumptions = bestPracticeSufficiencyAssumptions;
    }

    public String getBestPracticeTacticForMethods1And2() {
        return bestPracticeTacticForMethods1And2;
    }

    public void setBestPracticeTacticForMethods1And2(String bestPracticeTacticForMethods1And2) {
        this.bestPracticeTacticForMethods1And2 = bestPracticeTacticForMethods1And2;
    }

    public String getBestPracticeTacticForMethods3And4() {
        return bestPracticeTacticForMethods3And4;
    }

    public void setBestPracticeTacticForMethods3And4(String bestPracticeTacticForMethods3And4) {
        this.bestPracticeTacticForMethods3And4 = bestPracticeTacticForMethods3And4;
    }

    public String getBestPracticeTacticYesBut() {
        return bestPracticeTacticYesBut;
    }

    public void setBestPracticeTacticYesBut(String bestPracticeTacticYesBut) {
        this.bestPracticeTacticYesBut = bestPracticeTacticYesBut;
    }

    public String getBestPracticeTitle() {
        return bestPracticeTitle;
    }

    public void setBestPracticeTitle(String bestPracticeTitle) {
        this.bestPracticeTitle = bestPracticeTitle;
    }

    public String getBestPracticeTitleMultilineSeparator() {
        return bestPracticeTitleMultilineSeparator;
    }

    public void setBestPracticeTitleMultilineSeparator(String bestPracticeTitleMultilineSeparator) {
        this.bestPracticeTitleMultilineSeparator = bestPracticeTitleMultilineSeparator;
    }

    public String getCaptionBestPracticeNode() {
        return captionBestPracticeNode;
    }

    public void setCaptionBestPracticeNode(String captionBestPracticeNode) {
        this.captionBestPracticeNode = captionBestPracticeNode;
    }

    public String getCaptionChallengingAssumptionsAnalysis() {
        return captionChallengingAssumptionsAnalysis;
    }

    public void setCaptionChallengingAssumptionsAnalysis(String captionChallengingAssumptionsAnalysis) {
        this.captionChallengingAssumptionsAnalysis = captionChallengingAssumptionsAnalysis;
    }

    public String getCaptionGapAnalysis() {
        return captionGapAnalysis;
    }

    public void setCaptionGapAnalysis(String captionGapAnalysis) {
        this.captionGapAnalysis = captionGapAnalysis;
    }

    public String getCaptionNewRule() {
        return captionNewRule;
    }

    public void setCaptionNewRule(String captionNewRule) {
        this.captionNewRule = captionNewRule;
    }

    public String getCaptionNewRuleConflictExecution() {
        return captionNewRuleConflictExecution;
    }

    public void setCaptionNewRuleConflictExecution(String captionNewRuleConflictExecution) {
        this.captionNewRuleConflictExecution = captionNewRuleConflictExecution;
    }

    public String getCaptionNewRuleConflictPlanning() {
        return captionNewRuleConflictPlanning;
    }

    public void setCaptionNewRuleConflictPlanning(String captionNewRuleConflictPlanning) {
        this.captionNewRuleConflictPlanning = captionNewRuleConflictPlanning;
    }

    public String getCaptionResolutionMethod1() {
        return captionResolutionMethod1;
    }

    public void setCaptionResolutionMethod1(String captionResolutionMethod1) {
        this.captionResolutionMethod1 = captionResolutionMethod1;
    }

    public String getCaptionResolutionMethod2() {
        return captionResolutionMethod2;
    }

    public void setCaptionResolutionMethod2(String captionResolutionMethod2) {
        this.captionResolutionMethod2 = captionResolutionMethod2;
    }

    public String getCaptionResolutionMethod3() {
        return captionResolutionMethod3;
    }

    public void setCaptionResolutionMethod3(String captionResolutionMethod3) {
        this.captionResolutionMethod3 = captionResolutionMethod3;
    }

    public String getCaptionResolutionMethod4() {
        return captionResolutionMethod4;
    }

    public void setCaptionResolutionMethod4(String captionResolutionMethod4) {
        this.captionResolutionMethod4 = captionResolutionMethod4;
    }

    public String getCaptionRuleConflictExecution() {
        return captionRuleConflictExecution;
    }

    public void setCaptionRuleConflictExecution(String captionRuleConflictExecution) {
        this.captionRuleConflictExecution = captionRuleConflictExecution;
    }

    public String getCaptionRuleConflictPlanning() {
        return captionRuleConflictPlanning;
    }

    public void setCaptionRuleConflictPlanning(String captionRuleConflictPlanning) {
        this.captionRuleConflictPlanning = captionRuleConflictPlanning;
    }

    public String getCaptionYesButAnalysis() {
        return captionYesButAnalysis;
    }

    public void setCaptionYesButAnalysis(String captionYesButAnalysis) {
        this.captionYesButAnalysis = captionYesButAnalysis;
    }

    public String getConflictRuleYesButCategoryInsufficiency() {
        return conflictRuleYesButCategoryInsufficiency;
    }

    public void setConflictRuleYesButCategoryInsufficiency(String conflictRuleYesButCategoryInsufficiency) {
        this.conflictRuleYesButCategoryInsufficiency = conflictRuleYesButCategoryInsufficiency;
    }

    public String getConflictRuleYesButCategoryInsufficiencyColumn1() {
        return conflictRuleYesButCategoryInsufficiencyColumn1;
    }

    public void setConflictRuleYesButCategoryInsufficiencyColumn1(String conflictRuleYesButCategoryInsufficiencyColumn1) {
        this.conflictRuleYesButCategoryInsufficiencyColumn1 = conflictRuleYesButCategoryInsufficiencyColumn1;
    }

    public String getConflictRuleYesButCategoryInsufficiencyColumn2() {
        return conflictRuleYesButCategoryInsufficiencyColumn2;
    }

    public void setConflictRuleYesButCategoryInsufficiencyColumn2(String conflictRuleYesButCategoryInsufficiencyColumn2) {
        this.conflictRuleYesButCategoryInsufficiencyColumn2 = conflictRuleYesButCategoryInsufficiencyColumn2;
    }

    public String getConflictRuleYesButCategoryObstacles() {
        return conflictRuleYesButCategoryObstacles;
    }

    public void setConflictRuleYesButCategoryObstacles(String conflictRuleYesButCategoryObstacles) {
        this.conflictRuleYesButCategoryObstacles = conflictRuleYesButCategoryObstacles;
    }

    public String getConflictRuleYesButCategoryObstaclesColumn1() {
        return conflictRuleYesButCategoryObstaclesColumn1;
    }

    public void setConflictRuleYesButCategoryObstaclesColumn1(String conflictRuleYesButCategoryObstaclesColumn1) {
        this.conflictRuleYesButCategoryObstaclesColumn1 = conflictRuleYesButCategoryObstaclesColumn1;
    }

    public String getConflictRuleYesButCategoryObstaclesColumn2() {
        return conflictRuleYesButCategoryObstaclesColumn2;
    }

    public void setConflictRuleYesButCategoryObstaclesColumn2(String conflictRuleYesButCategoryObstaclesColumn2) {
        this.conflictRuleYesButCategoryObstaclesColumn2 = conflictRuleYesButCategoryObstaclesColumn2;
    }

    public String getConflictRuleYesButCategoryStakeholder() {
        return conflictRuleYesButCategoryStakeholder;
    }

    public void setConflictRuleYesButCategoryStakeholder(String conflictRuleYesButCategoryStakeholder) {
        this.conflictRuleYesButCategoryStakeholder = conflictRuleYesButCategoryStakeholder;
    }

    public String getConflictRuleYesButCategoryUnDesirableEffects() {
        return conflictRuleYesButCategoryUnDesirableEffects;
    }

    public void setConflictRuleYesButCategoryUnDesirableEffects(String conflictRuleYesButCategoryUnDesirableEffects) {
        this.conflictRuleYesButCategoryUnDesirableEffects = conflictRuleYesButCategoryUnDesirableEffects;
    }

    public String getConflictRuleYesButCategoryUnDesirableEffectsColumn1() {
        return conflictRuleYesButCategoryUnDesirableEffectsColumn1;
    }

    public void setConflictRuleYesButCategoryUnDesirableEffectsColumn1(String conflictRuleYesButCategoryUnDesirableEffectsColumn1) {
        this.conflictRuleYesButCategoryUnDesirableEffectsColumn1 = conflictRuleYesButCategoryUnDesirableEffectsColumn1;
    }

    public String getConflictRuleYesButCategoryUnDesirableEffectsColumn2() {
        return conflictRuleYesButCategoryUnDesirableEffectsColumn2;
    }

    public void setConflictRuleYesButCategoryUnDesirableEffectsColumn2(String conflictRuleYesButCategoryUnDesirableEffectsColumn2) {
        this.conflictRuleYesButCategoryUnDesirableEffectsColumn2 = conflictRuleYesButCategoryUnDesirableEffectsColumn2;
    }

    public String getDefaultNodeTitleGap() {
        return defaultNodeTitleGap;
    }

    public void setDefaultNodeTitleGap(String defaultNodeTitleGap) {
        this.defaultNodeTitleGap = defaultNodeTitleGap;
    }

    public String getDefaultNodeTitleRule1Goal() {
        return defaultNodeTitleRule1Goal;
    }

    public void setDefaultNodeTitleRule1Goal(String defaultNodeTitleRule1Goal) {
        this.defaultNodeTitleRule1Goal = defaultNodeTitleRule1Goal;
    }

    public String getDefaultNodeTitleRule2Goal() {
        return defaultNodeTitleRule2Goal;
    }

    public void setDefaultNodeTitleRule2Goal(String defaultNodeTitleRule2Goal) {
        this.defaultNodeTitleRule2Goal = defaultNodeTitleRule2Goal;
    }

    public String getDefaultNodeTitleImpact() {
        return defaultNodeTitleImpact;
    }

    public void setDefaultNodeTitleImpact(String defaultNodeTitleImpact) {
        this.defaultNodeTitleImpact = defaultNodeTitleImpact;
    }

    public String getDefaultNodeTitleProblem() {
        return defaultNodeTitleProblem;
    }

    public void setDefaultNodeTitleProblem(String defaultNodeTitleProblem) {
        this.defaultNodeTitleProblem = defaultNodeTitleProblem;
    }

    public String getDefaultNodeTitleRule2Risk1() {
        return defaultNodeTitleRule2Risk1;
    }

    public void setDefaultNodeTitleRule2Risk1(String defaultNodeTitleRule2Risk1) {
        this.defaultNodeTitleRule2Risk1 = defaultNodeTitleRule2Risk1;
    }

    public String getDefaultNodeTitleRule2Risk2() {
        return defaultNodeTitleRule2Risk2;
    }

    public void setDefaultNodeTitleRule2Risk2(String defaultNodeTitleRule2Risk2) {
        this.defaultNodeTitleRule2Risk2 = defaultNodeTitleRule2Risk2;
    }

    public String getDefaultNodeTitleRule1Tactic1() {
        return defaultNodeTitleRule1Tactic1;
    }

    public void setDefaultNodeTitleRule1Tactic1(String defaultNodeTitleRule1Tactic1) {
        this.defaultNodeTitleRule1Tactic1 = defaultNodeTitleRule1Tactic1;
    }

    public String getDefaultNodeTitleRule1Tactic1Other() {
        return defaultNodeTitleRule1Tactic1Other;
    }

    public void setDefaultNodeTitleRule1Tactic1Other(String defaultNodeTitleRule1Tactic1Other) {
        this.defaultNodeTitleRule1Tactic1Other = defaultNodeTitleRule1Tactic1Other;
    }

    public String getDefaultNodeTitleRule1Tactic1Me() {
        return defaultNodeTitleRule1Tactic1Me;
    }

    public void setDefaultNodeTitleRule1Tactic1Me(String defaultNodeTitleRule1Tactic1Me) {
        this.defaultNodeTitleRule1Tactic1Me = defaultNodeTitleRule1Tactic1Me;
    }

    public String getDefaultNodeTitleRule1Tactic2() {
        return defaultNodeTitleRule1Tactic2;
    }

    public void setDefaultNodeTitleRule1Tactic2(String defaultNodeTitleRule1Tactic2) {
        this.defaultNodeTitleRule1Tactic2 = defaultNodeTitleRule1Tactic2;
    }

    public String getDefaultNodeTitleRule1Tactic2Other() {
        return defaultNodeTitleRule1Tactic2Other;
    }

    public void setDefaultNodeTitleRule1Tactic2Other(String defaultNodeTitleRule1Tactic2Other) {
        this.defaultNodeTitleRule1Tactic2Other = defaultNodeTitleRule1Tactic2Other;
    }

    public String getDefaultNodeTitleRule1Tactic2Me() {
        return defaultNodeTitleRule1Tactic2Me;
    }

    public void setDefaultNodeTitleRule1Tactic2Me(String defaultNodeTitleRule1Tactic2Me) {
        this.defaultNodeTitleRule1Tactic2Me = defaultNodeTitleRule1Tactic2Me;
    }

    public String getDefaultNodeTitleRule2Tactic1() {
        return defaultNodeTitleRule2Tactic1;
    }

    public void setDefaultNodeTitleRule2Tactic1(String defaultNodeTitleRule2Tactic1) {
        this.defaultNodeTitleRule2Tactic1 = defaultNodeTitleRule2Tactic1;
    }

    public String getDefaultNodeTitleRule2Tactic2() {
        return defaultNodeTitleRule2Tactic2;
    }

    public void setDefaultNodeTitleRule2Tactic2(String defaultNodeTitleRule2Tactic2) {
        this.defaultNodeTitleRule2Tactic2 = defaultNodeTitleRule2Tactic2;
    }

    public String getDefaultNodeTitleRule2Strategy1() {
        return defaultNodeTitleRule2Strategy1;
    }

    public void setDefaultNodeTitleRule2Strategy1(String defaultNodeTitleRule2Strategy1) {
        this.defaultNodeTitleRule2Strategy1 = defaultNodeTitleRule2Strategy1;
    }

    public String getDefaultNodeTitleRule2Strategy2() {
        return defaultNodeTitleRule2Strategy2;
    }

    public void setDefaultNodeTitleRule2Strategy2(String defaultNodeTitleRule2Strategy2) {
        this.defaultNodeTitleRule2Strategy2 = defaultNodeTitleRule2Strategy2;
    }

    public String getDefaultNodeTitleRule1Threat() {
        return defaultNodeTitleRule1Threat;
    }

    public void setDefaultNodeTitleRule1Threat(String defaultNodeTitleRule1Threat) {
        this.defaultNodeTitleRule1Threat = defaultNodeTitleRule1Threat;
    }

    public String getDefaultNodeTitleRule2Threat() {
        return defaultNodeTitleRule2Threat;
    }

    public void setDefaultNodeTitleRule2Threat(String defaultNodeTitleRule2Threat) {
        this.defaultNodeTitleRule2Threat = defaultNodeTitleRule2Threat;
    }

    public String getDefaultNodeTitleUde() {
        return defaultNodeTitleUde;
    }

    public void setDefaultNodeTitleUde(String defaultNodeTitleUde) {
        this.defaultNodeTitleUde = defaultNodeTitleUde;
    }

    public String getMergedConflictProperyItem() {
        return mergedConflictProperyItem;
    }

    public void setMergedConflictProperyItem(String mergedConflictProperyItem) {
        this.mergedConflictProperyItem = mergedConflictProperyItem;
    }

    public String getMergedConflictTemporaryName() {
        return mergedConflictTemporaryName;
    }

    public void setMergedConflictTemporaryName(String mergedConflictTemporaryName) {
        this.mergedConflictTemporaryName = mergedConflictTemporaryName;
    }

    public String getMergedConflictTitle() {
        return mergedConflictTitle;
    }

    public void setMergedConflictTitle(String mergedConflictTitle) {
        this.mergedConflictTitle = mergedConflictTitle;
    }

    public String getMergedConflictValuesSeparator() {
        return mergedConflictValuesSeparator;
    }

    public void setMergedConflictValuesSeparator(String mergedConflictValuesSeparator) {
        this.mergedConflictValuesSeparator = mergedConflictValuesSeparator;
    }

    public String getMethod1Way1GuideAssumption() {
        return method1Way1GuideAssumption;
    }

    public void setMethod1Way1GuideAssumption(String method1Way1GuideAssumption) {
        this.method1Way1GuideAssumption = method1Way1GuideAssumption;
    }

    public String getMethod1Way1GuideHowTo() {
        return method1Way1GuideHowTo;
    }

    public void setMethod1Way1GuideHowTo(String method1Way1GuideHowTo) {
        this.method1Way1GuideHowTo = method1Way1GuideHowTo;
    }

    public String getMethod1Way1GuideInjection() {
        return method1Way1GuideInjection;
    }

    public void setMethod1Way1GuideInjection(String method1Way1GuideInjection) {
        this.method1Way1GuideInjection = method1Way1GuideInjection;
    }

    public String getMethod1Way1ValueAssumption() {
        return method1Way1ValueAssumption;
    }

    public void setMethod1Way1ValueAssumption(String method1Way1ValueAssumption) {
        this.method1Way1ValueAssumption = method1Way1ValueAssumption;
    }

    public String getMethod1Way1ValueHowTo() {
        return method1Way1ValueHowTo;
    }

    public void setMethod1Way1ValueHowTo(String method1Way1ValueHowTo) {
        this.method1Way1ValueHowTo = method1Way1ValueHowTo;
    }

    public String getMethod1Way1ValueInjection() {
        return method1Way1ValueInjection;
    }

    public void setMethod1Way1ValueInjection(String method1Way1ValueInjection) {
        this.method1Way1ValueInjection = method1Way1ValueInjection;
    }

    public String getMethod1Way2GuideAssumption() {
        return method1Way2GuideAssumption;
    }

    public void setMethod1Way2GuideAssumption(String method1Way2GuideAssumption) {
        this.method1Way2GuideAssumption = method1Way2GuideAssumption;
    }

    public String getMethod1Way2GuideHowTo() {
        return method1Way2GuideHowTo;
    }

    public void setMethod1Way2GuideHowTo(String method1Way2GuideHowTo) {
        this.method1Way2GuideHowTo = method1Way2GuideHowTo;
    }

    public String getMethod1Way2GuideInjection() {
        return method1Way2GuideInjection;
    }

    public void setMethod1Way2GuideInjection(String method1Way2GuideInjection) {
        this.method1Way2GuideInjection = method1Way2GuideInjection;
    }

    public String getMethod1Way2ValueAssumption() {
        return method1Way2ValueAssumption;
    }

    public void setMethod1Way2ValueAssumption(String method1Way2ValueAssumption) {
        this.method1Way2ValueAssumption = method1Way2ValueAssumption;
    }

    public String getMethod1Way2ValueHowTo() {
        return method1Way2ValueHowTo;
    }

    public void setMethod1Way2ValueHowTo(String method1Way2ValueHowTo) {
        this.method1Way2ValueHowTo = method1Way2ValueHowTo;
    }

    public String getMethod1Way2ValueInjection() {
        return method1Way2ValueInjection;
    }

    public void setMethod1Way2ValueInjection(String method1Way2ValueInjection) {
        this.method1Way2ValueInjection = method1Way2ValueInjection;
    }

    public String getMethod2Way1GuideAssumption() {
        return method2Way1GuideAssumption;
    }

    public void setMethod2Way1GuideAssumption(String method2Way1GuideAssumption) {
        this.method2Way1GuideAssumption = method2Way1GuideAssumption;
    }

    public String getMethod2Way1GuideHowTo() {
        return method2Way1GuideHowTo;
    }

    public void setMethod2Way1GuideHowTo(String method2Way1GuideHowTo) {
        this.method2Way1GuideHowTo = method2Way1GuideHowTo;
    }

    public String getMethod2Way1GuideInjection() {
        return method2Way1GuideInjection;
    }

    public void setMethod2Way1GuideInjection(String method2Way1GuideInjection) {
        this.method2Way1GuideInjection = method2Way1GuideInjection;
    }

    public String getMethod2Way1ValueAssumption() {
        return method2Way1ValueAssumption;
    }

    public void setMethod2Way1ValueAssumption(String method2Way1ValueAssumption) {
        this.method2Way1ValueAssumption = method2Way1ValueAssumption;
    }

    public String getMethod2Way1ValueHowTo() {
        return method2Way1ValueHowTo;
    }

    public void setMethod2Way1ValueHowTo(String method2Way1ValueHowTo) {
        this.method2Way1ValueHowTo = method2Way1ValueHowTo;
    }

    public String getMethod2Way1ValueInjection() {
        return method2Way1ValueInjection;
    }

    public void setMethod2Way1ValueInjection(String method2Way1ValueInjection) {
        this.method2Way1ValueInjection = method2Way1ValueInjection;
    }

    public String getMethod2Way2GuideAssumption() {
        return method2Way2GuideAssumption;
    }

    public void setMethod2Way2GuideAssumption(String method2Way2GuideAssumption) {
        this.method2Way2GuideAssumption = method2Way2GuideAssumption;
    }

    public String getMethod2Way2GuideHowTo() {
        return method2Way2GuideHowTo;
    }

    public void setMethod2Way2GuideHowTo(String method2Way2GuideHowTo) {
        this.method2Way2GuideHowTo = method2Way2GuideHowTo;
    }

    public String getMethod2Way2GuideInjection() {
        return method2Way2GuideInjection;
    }

    public void setMethod2Way2GuideInjection(String method2Way2GuideInjection) {
        this.method2Way2GuideInjection = method2Way2GuideInjection;
    }

    public String getMethod2Way2ValueAssumption() {
        return method2Way2ValueAssumption;
    }

    public void setMethod2Way2ValueAssumption(String method2Way2ValueAssumption) {
        this.method2Way2ValueAssumption = method2Way2ValueAssumption;
    }

    public String getMethod2Way2ValueHowTo() {
        return method2Way2ValueHowTo;
    }

    public void setMethod2Way2ValueHowTo(String method2Way2ValueHowTo) {
        this.method2Way2ValueHowTo = method2Way2ValueHowTo;
    }

    public String getMethod2Way2ValueInjection() {
        return method2Way2ValueInjection;
    }

    public void setMethod2Way2ValueInjection(String method2Way2ValueInjection) {
        this.method2Way2ValueInjection = method2Way2ValueInjection;
    }

    public String getMethod3Way1GuideAssumption() {
        return method3Way1GuideAssumption;
    }

    public void setMethod3Way1GuideAssumption(String method3Way1GuideAssumption) {
        this.method3Way1GuideAssumption = method3Way1GuideAssumption;
    }

    public String getMethod3Way1GuideHowTo() {
        return method3Way1GuideHowTo;
    }

    public void setMethod3Way1GuideHowTo(String method3Way1GuideHowTo) {
        this.method3Way1GuideHowTo = method3Way1GuideHowTo;
    }

    public String getMethod3Way1GuideInjection() {
        return method3Way1GuideInjection;
    }

    public void setMethod3Way1GuideInjection(String method3Way1GuideInjection) {
        this.method3Way1GuideInjection = method3Way1GuideInjection;
    }

    public String getMethod3Way1ValueAssumption() {
        return method3Way1ValueAssumption;
    }

    public void setMethod3Way1ValueAssumption(String method3Way1ValueAssumption) {
        this.method3Way1ValueAssumption = method3Way1ValueAssumption;
    }

    public String getMethod3Way1ValueHowTo() {
        return method3Way1ValueHowTo;
    }

    public void setMethod3Way1ValueHowTo(String method3Way1ValueHowTo) {
        this.method3Way1ValueHowTo = method3Way1ValueHowTo;
    }

    public String getMethod3Way1ValueInjection() {
        return method3Way1ValueInjection;
    }

    public void setMethod3Way1ValueInjection(String method3Way1ValueInjection) {
        this.method3Way1ValueInjection = method3Way1ValueInjection;
    }

    public String getMethod4Way1GuideAssumption() {
        return method4Way1GuideAssumption;
    }

    public void setMethod4Way1GuideAssumption(String method4Way1GuideAssumption) {
        this.method4Way1GuideAssumption = method4Way1GuideAssumption;
    }

    public String getMethod4Way1GuideHowTo() {
        return method4Way1GuideHowTo;
    }

    public void setMethod4Way1GuideHowTo(String method4Way1GuideHowTo) {
        this.method4Way1GuideHowTo = method4Way1GuideHowTo;
    }

    public String getMethod4Way1GuideInjection() {
        return method4Way1GuideInjection;
    }

    public void setMethod4Way1GuideInjection(String method4Way1GuideInjection) {
        this.method4Way1GuideInjection = method4Way1GuideInjection;
    }

    public String getMethod4Way1ValueAssumption() {
        return method4Way1ValueAssumption;
    }

    public void setMethod4Way1ValueAssumption(String method4Way1ValueAssumption) {
        this.method4Way1ValueAssumption = method4Way1ValueAssumption;
    }

    public String getMethod4Way1ValueHowTo() {
        return method4Way1ValueHowTo;
    }

    public void setMethod4Way1ValueHowTo(String method4Way1ValueHowTo) {
        this.method4Way1ValueHowTo = method4Way1ValueHowTo;
    }

    public String getMethod4Way1ValueInjection() {
        return method4Way1ValueInjection;
    }

    public void setMethod4Way1ValueInjection(String method4Way1ValueInjection) {
        this.method4Way1ValueInjection = method4Way1ValueInjection;
    }

    public String getNodeGroupGap() {
        return nodeGroupGap;
    }

    public void setNodeGroupGap(String nodeGroupGap) {
        this.nodeGroupGap = nodeGroupGap;
    }

    public String getNodeGroupGoal() {
        return nodeGroupGoal;
    }

    public void setNodeGroupGoal(String nodeGroupGoal) {
        this.nodeGroupGoal = nodeGroupGoal;
    }

    public String getNodeGroupImpact() {
        return nodeGroupImpact;
    }

    public void setNodeGroupImpact(String nodeGroupImpact) {
        this.nodeGroupImpact = nodeGroupImpact;
    }

    public String getNodeGroupProblem() {
        return nodeGroupProblem;
    }

    public void setNodeGroupProblem(String nodeGroupProblem) {
        this.nodeGroupProblem = nodeGroupProblem;
    }

    public String getNodeGroupRisk1() {
        return nodeGroupRisk1;
    }

    public void setNodeGroupRisk1(String nodeGroupRisk1) {
        this.nodeGroupRisk1 = nodeGroupRisk1;
    }

    public String getNodeGroupRisk2() {
        return nodeGroupRisk2;
    }

    public void setNodeGroupRisk2(String nodeGroupRisk2) {
        this.nodeGroupRisk2 = nodeGroupRisk2;
    }

    public String getNodeGroupStrategy1() {
        return nodeGroupStrategy1;
    }

    public void setNodeGroupStrategy1(String nodeGroupStrategy1) {
        this.nodeGroupStrategy1 = nodeGroupStrategy1;
    }

    public String getNodeGroupStrategy2() {
        return nodeGroupStrategy2;
    }

    public void setNodeGroupStrategy2(String nodeGroupStrategy2) {
        this.nodeGroupStrategy2 = nodeGroupStrategy2;
    }

    public String getNodeGroupTactic1() {
        return nodeGroupTactic1;
    }

    public void setNodeGroupTactic1(String nodeGroupTactic1) {
        this.nodeGroupTactic1 = nodeGroupTactic1;
    }

    public String getNodeGroupTactic2() {
        return nodeGroupTactic2;
    }

    public void setNodeGroupTactic2(String nodeGroupTactic2) {
        this.nodeGroupTactic2 = nodeGroupTactic2;
    }

    public String getNodeGroupTacticMethod1() {
        return nodeGroupTacticMethod1;
    }

    public void setNodeGroupTacticMethod1(String nodeGroupTacticMethod1) {
        this.nodeGroupTacticMethod1 = nodeGroupTacticMethod1;
    }

    public String getNodeGroupTacticMethod2() {
        return nodeGroupTacticMethod2;
    }

    public void setNodeGroupTacticMethod2(String nodeGroupTacticMethod2) {
        this.nodeGroupTacticMethod2 = nodeGroupTacticMethod2;
    }

    public String getNodeGroupTacticMethod3() {
        return nodeGroupTacticMethod3;
    }

    public void setNodeGroupTacticMethod3(String nodeGroupTacticMethod3) {
        this.nodeGroupTacticMethod3 = nodeGroupTacticMethod3;
    }

    public String getNodeGroupTacticMethod4() {
        return nodeGroupTacticMethod4;
    }

    public void setNodeGroupTacticMethod4(String nodeGroupTacticMethod4) {
        this.nodeGroupTacticMethod4 = nodeGroupTacticMethod4;
    }

    public String getNodeGroupThreat() {
        return nodeGroupThreat;
    }

    public void setNodeGroupThreat(String nodeGroupThreat) {
        this.nodeGroupThreat = nodeGroupThreat;
    }

    public String getNodeGroupUde() {
        return nodeGroupUde;
    }

    public void setNodeGroupUde(String nodeGroupUde) {
        this.nodeGroupUde = nodeGroupUde;
    }

    public String getNodeGuideGap() {
        return nodeGuideGap;
    }

    public void setNodeGuideGap(String nodeGuideGap) {
        this.nodeGuideGap = nodeGuideGap;
    }

    public String getNodeGuideImpact() {
        return nodeGuideImpact;
    }

    public void setNodeGuideImpact(String nodeGuideImpact) {
        this.nodeGuideImpact = nodeGuideImpact;
    }

    public String getNodeGuideProblem() {
        return nodeGuideProblem;
    }

    public void setNodeGuideProblem(String nodeGuideProblem) {
        this.nodeGuideProblem = nodeGuideProblem;
    }

    public String getNodeGuideRule1Goal() {
        return nodeGuideRule1Goal;
    }

    public void setNodeGuideRule1Goal(String nodeGuideRule1Goal) {
        this.nodeGuideRule1Goal = nodeGuideRule1Goal;
    }

    public String getNodeGuideRule1Risk1() {
        return nodeGuideRule1Risk1;
    }

    public void setNodeGuideRule1Risk1(String nodeGuideRule1Risk1) {
        this.nodeGuideRule1Risk1 = nodeGuideRule1Risk1;
    }

    public String getNodeGuideRule1Risk2() {
        return nodeGuideRule1Risk2;
    }

    public void setNodeGuideRule1Risk2(String nodeGuideRule1Risk2) {
        this.nodeGuideRule1Risk2 = nodeGuideRule1Risk2;
    }

    public String getNodeGuideRule1Strategy1() {
        return nodeGuideRule1Strategy1;
    }

    public void setNodeGuideRule1Strategy1(String nodeGuideRule1Strategy1) {
        this.nodeGuideRule1Strategy1 = nodeGuideRule1Strategy1;
    }

    public String getNodeGuideRule1Strategy2() {
        return nodeGuideRule1Strategy2;
    }

    public void setNodeGuideRule1Strategy2(String nodeGuideRule1Strategy2) {
        this.nodeGuideRule1Strategy2 = nodeGuideRule1Strategy2;
    }

    public String getNodeGuideRule1Tactic1() {
        return nodeGuideRule1Tactic1;
    }

    public void setNodeGuideRule1Tactic1(String nodeGuideRule1Tactic1) {
        this.nodeGuideRule1Tactic1 = nodeGuideRule1Tactic1;
    }

    public String getNodeGuideRule1Tactic2() {
        return nodeGuideRule1Tactic2;
    }

    public void setNodeGuideRule1Tactic2(String nodeGuideRule1Tactic2) {
        this.nodeGuideRule1Tactic2 = nodeGuideRule1Tactic2;
    }

    public String getNodeGuideRule1Threat() {
        return nodeGuideRule1Threat;
    }

    public void setNodeGuideRule1Threat(String nodeGuideRule1Threat) {
        this.nodeGuideRule1Threat = nodeGuideRule1Threat;
    }

    public String getNodeGuideRule2Goal() {
        return nodeGuideRule2Goal;
    }

    public void setNodeGuideRule2Goal(String nodeGuideRule2Goal) {
        this.nodeGuideRule2Goal = nodeGuideRule2Goal;
    }

    public String getNodeGuideRule2Risk1() {
        return nodeGuideRule2Risk1;
    }

    public void setNodeGuideRule2Risk1(String nodeGuideRule2Risk1) {
        this.nodeGuideRule2Risk1 = nodeGuideRule2Risk1;
    }

    public String getNodeGuideRule2Risk2() {
        return nodeGuideRule2Risk2;
    }

    public void setNodeGuideRule2Risk2(String nodeGuideRule2Risk2) {
        this.nodeGuideRule2Risk2 = nodeGuideRule2Risk2;
    }

    public String getNodeGuideRule2Strategy1() {
        return nodeGuideRule2Strategy1;
    }

    public void setNodeGuideRule2Strategy1(String nodeGuideRule2Strategy1) {
        this.nodeGuideRule2Strategy1 = nodeGuideRule2Strategy1;
    }

    public String getNodeGuideRule2Strategy2() {
        return nodeGuideRule2Strategy2;
    }

    public void setNodeGuideRule2Strategy2(String nodeGuideRule2Strategy2) {
        this.nodeGuideRule2Strategy2 = nodeGuideRule2Strategy2;
    }

    public String getNodeGuideRule2Tactic1() {
        return nodeGuideRule2Tactic1;
    }

    public void setNodeGuideRule2Tactic1(String nodeGuideRule2Tactic1) {
        this.nodeGuideRule2Tactic1 = nodeGuideRule2Tactic1;
    }

    public String getNodeGuideRule2Tactic2() {
        return nodeGuideRule2Tactic2;
    }

    public void setNodeGuideRule2Tactic2(String nodeGuideRule2Tactic2) {
        this.nodeGuideRule2Tactic2 = nodeGuideRule2Tactic2;
    }

    public String getNodeGuideRule2Threat() {
        return nodeGuideRule2Threat;
    }

    public void setNodeGuideRule2Threat(String nodeGuideRule2Threat) {
        this.nodeGuideRule2Threat = nodeGuideRule2Threat;
    }

    public String getNodeGuideTacticMethod1() {
        return nodeGuideTacticMethod1;
    }

    public void setNodeGuideTacticMethod1(String nodeGuideTacticMethod1) {
        this.nodeGuideTacticMethod1 = nodeGuideTacticMethod1;
    }

    public String getNodeGuideTacticMethod2() {
        return nodeGuideTacticMethod2;
    }

    public void setNodeGuideTacticMethod2(String nodeGuideTacticMethod2) {
        this.nodeGuideTacticMethod2 = nodeGuideTacticMethod2;
    }

    public String getNodeGuideTacticMethod3() {
        return nodeGuideTacticMethod3;
    }

    public void setNodeGuideTacticMethod3(String nodeGuideTacticMethod3) {
        this.nodeGuideTacticMethod3 = nodeGuideTacticMethod3;
    }

    public String getNodeGuideTacticMethod4() {
        return nodeGuideTacticMethod4;
    }

    public void setNodeGuideTacticMethod4(String nodeGuideTacticMethod4) {
        this.nodeGuideTacticMethod4 = nodeGuideTacticMethod4;
    }

    public String getNodeGuideUde() {
        return nodeGuideUde;
    }

    public void setNodeGuideUde(String nodeGuideUde) {
        this.nodeGuideUde = nodeGuideUde;
    }

    public String getNodeHeaderProblem() {
        return nodeHeaderProblem;
    }

    public void setNodeHeaderProblem(String nodeHeaderProblem) {
        this.nodeHeaderProblem = nodeHeaderProblem;
    }

    public String getNodeHeaderGap() {
        return nodeHeaderGap;
    }

    public void setNodeHeaderGap(String nodeHeaderGap) {
        this.nodeHeaderGap = nodeHeaderGap;
    }

    public String getNodeHeaderImpact() {
        return nodeHeaderImpact;
    }

    public void setNodeHeaderImpact(String nodeHeaderImpact) {
        this.nodeHeaderImpact = nodeHeaderImpact;
    }

    public String getNodeHeaderGoalRule1() {
        return nodeHeaderGoalRule1;
    }

    public void setNodeHeaderGoalRule1(String nodeHeaderGoalRule1) {
        this.nodeHeaderGoalRule1 = nodeHeaderGoalRule1;
    }

    public String getNodeHeaderGoalRule2() {
        return nodeHeaderGoalRule2;
    }

    public void setNodeHeaderGoalRule2(String nodeHeaderGoalRule2) {
        this.nodeHeaderGoalRule2 = nodeHeaderGoalRule2;
    }

    public String getNodeHeaderRisk1Rule1() {
        return nodeHeaderRisk1Rule1;
    }

    public void setNodeHeaderRisk1Rule1(String nodeHeaderRisk1Rule1) {
        this.nodeHeaderRisk1Rule1 = nodeHeaderRisk1Rule1;
    }

    public String getNodeHeaderRisk1Rule2() {
        return nodeHeaderRisk1Rule2;
    }

    public void setNodeHeaderRisk1Rule2(String nodeHeaderRisk1Rule2) {
        this.nodeHeaderRisk1Rule2 = nodeHeaderRisk1Rule2;
    }

    public String getNodeHeaderStrategy1Rule1() {
        return nodeHeaderStrategy1Rule1;
    }

    public void setNodeHeaderStrategy1Rule1(String nodeHeaderStrategy1Rule1) {
        this.nodeHeaderStrategy1Rule1 = nodeHeaderStrategy1Rule1;
    }

    public String getNodeHeaderStrategy1Rule2() {
        return nodeHeaderStrategy1Rule2;
    }

    public void setNodeHeaderStrategy1Rule2(String nodeHeaderStrategy1Rule2) {
        this.nodeHeaderStrategy1Rule2 = nodeHeaderStrategy1Rule2;
    }

    public String getNodeHeaderTactic1Rule1() {
        return nodeHeaderTactic1Rule1;
    }

    public void setNodeHeaderTactic1Rule1(String nodeHeaderTactic1Rule1) {
        this.nodeHeaderTactic1Rule1 = nodeHeaderTactic1Rule1;
    }

    public String getNodeHeaderTactic1Rule2() {
        return nodeHeaderTactic1Rule2;
    }

    public void setNodeHeaderTactic1Rule2(String nodeHeaderTactic1Rule2) {
        this.nodeHeaderTactic1Rule2 = nodeHeaderTactic1Rule2;
    }

    public String getNodeHeaderRisk2Rule1() {
        return nodeHeaderRisk2Rule1;
    }

    public void setNodeHeaderRisk2Rule1(String nodeHeaderRisk2Rule1) {
        this.nodeHeaderRisk2Rule1 = nodeHeaderRisk2Rule1;
    }

    public String getNodeHeaderRisk2Rule2() {
        return nodeHeaderRisk2Rule2;
    }

    public void setNodeHeaderRisk2Rule2(String nodeHeaderRisk2Rule2) {
        this.nodeHeaderRisk2Rule2 = nodeHeaderRisk2Rule2;
    }

    public String getNodeHeaderStrategy2Rule1() {
        return nodeHeaderStrategy2Rule1;
    }

    public void setNodeHeaderStrategy2Rule1(String nodeHeaderStrategy2Rule1) {
        this.nodeHeaderStrategy2Rule1 = nodeHeaderStrategy2Rule1;
    }

    public String getNodeHeaderStrategy2Rule2() {
        return nodeHeaderStrategy2Rule2;
    }

    public void setNodeHeaderStrategy2Rule2(String nodeHeaderStrategy2Rule2) {
        this.nodeHeaderStrategy2Rule2 = nodeHeaderStrategy2Rule2;
    }

    public String getNodeHeaderTactic2Rule1() {
        return nodeHeaderTactic2Rule1;
    }

    public void setNodeHeaderTactic2Rule1(String nodeHeaderTactic2Rule1) {
        this.nodeHeaderTactic2Rule1 = nodeHeaderTactic2Rule1;
    }

    public String getNodeHeaderTactic2Rule2() {
        return nodeHeaderTactic2Rule2;
    }

    public void setNodeHeaderTactic2Rule2(String nodeHeaderTactic2Rule2) {
        this.nodeHeaderTactic2Rule2 = nodeHeaderTactic2Rule2;
    }

    public String getNodeHeaderThreatRule1() {
        return nodeHeaderThreatRule1;
    }

    public void setNodeHeaderThreatRule1(String nodeHeaderThreatRule1) {
        this.nodeHeaderThreatRule1 = nodeHeaderThreatRule1;
    }

    public String getNodeHeaderThreatRule2() {
        return nodeHeaderThreatRule2;
    }

    public void setNodeHeaderThreatRule2(String nodeHeaderThreatRule2) {
        this.nodeHeaderThreatRule2 = nodeHeaderThreatRule2;
    }

    public String getNodeHeaderUde() {
        return nodeHeaderUde;
    }

    public void setNodeHeaderUde(String nodeHeaderUde) {
        this.nodeHeaderUde = nodeHeaderUde;
    }

    public String getNodeNumberGap() {
        return nodeNumberGap;
    }

    public void setNodeNumberGap(String nodeNumberGap) {
        this.nodeNumberGap = nodeNumberGap;
    }

    public String getNodeNumberGoal() {
        return nodeNumberGoal;
    }

    public void setNodeNumberGoal(String nodeNumberGoal) {
        this.nodeNumberGoal = nodeNumberGoal;
    }

    public String getNodeNumberImpact() {
        return nodeNumberImpact;
    }

    public void setNodeNumberImpact(String nodeNumberImpact) {
        this.nodeNumberImpact = nodeNumberImpact;
    }

    public String getNodeNumberProblem() {
        return nodeNumberProblem;
    }

    public void setNodeNumberProblem(String nodeNumberProblem) {
        this.nodeNumberProblem = nodeNumberProblem;
    }

    public String getNodeNumberRisk() {
        return nodeNumberRisk;
    }

    public void setNodeNumberRisk(String nodeNumberRisk) {
        this.nodeNumberRisk = nodeNumberRisk;
    }

    public String getNodeNumberStrategy() {
        return nodeNumberStrategy;
    }

    public void setNodeNumberStrategy(String nodeNumberStrategy) {
        this.nodeNumberStrategy = nodeNumberStrategy;
    }

    public String getNodeNumberTactic() {
        return nodeNumberTactic;
    }

    public void setNodeNumberTactic(String nodeNumberTactic) {
        this.nodeNumberTactic = nodeNumberTactic;
    }

    public String getNodeNumberTacticMethod() {
        return nodeNumberTacticMethod;
    }

    public void setNodeNumberTacticMethod(String nodeNumberTacticMethod) {
        this.nodeNumberTacticMethod = nodeNumberTacticMethod;
    }

    public String getNodeNumberThreat() {
        return nodeNumberThreat;
    }

    public void setNodeNumberThreat(String nodeNumberThreat) {
        this.nodeNumberThreat = nodeNumberThreat;
    }

    public String getNodeNumberUde() {
        return nodeNumberUde;
    }

    public void setNodeNumberUde(String nodeNumberUde) {
        this.nodeNumberUde = nodeNumberUde;
    }

    public String getResolutionMethodFistPlus() {
        return resolutionMethodFistPlus;
    }

    public void setResolutionMethodFistPlus(String resolutionMethodFistPlus) {
        this.resolutionMethodFistPlus = resolutionMethodFistPlus;
    }

    public String getResolutionMethodHowElse() {
        return resolutionMethodHowElse;
    }

    public void setResolutionMethodHowElse(String resolutionMethodHowElse) {
        this.resolutionMethodHowElse = resolutionMethodHowElse;
    }

    public String getResolutionMethodSecondPlus() {
        return resolutionMethodSecondPlus;
    }

    public void setResolutionMethodSecondPlus(String resolutionMethodSecondPlus) {
        this.resolutionMethodSecondPlus = resolutionMethodSecondPlus;
    }

    public String getResolutionMethodWhy() {
        return resolutionMethodWhy;
    }

    public void setResolutionMethodWhy(String resolutionMethodWhy) {
        this.resolutionMethodWhy = resolutionMethodWhy;
    }

    public String getSimpleResolutionMethod1Question1() {
        return simpleResolutionMethod1Question1;
    }

    public void setSimpleResolutionMethod1Question1(String simpleResolutionMethod1Question1) {
        this.simpleResolutionMethod1Question1 = simpleResolutionMethod1Question1;
    }

    public String getSimpleResolutionMethod1Question2() {
        return simpleResolutionMethod1Question2;
    }

    public void setSimpleResolutionMethod1Question2(String simpleResolutionMethod1Question2) {
        this.simpleResolutionMethod1Question2 = simpleResolutionMethod1Question2;
    }

    public String getSimpleResolutionMethod2Question1() {
        return simpleResolutionMethod2Question1;
    }

    public void setSimpleResolutionMethod2Question1(String simpleResolutionMethod2Question1) {
        this.simpleResolutionMethod2Question1 = simpleResolutionMethod2Question1;
    }

    public String getSimpleResolutionMethod2Question2() {
        return simpleResolutionMethod2Question2;
    }

    public void setSimpleResolutionMethod2Question2(String simpleResolutionMethod2Question2) {
        this.simpleResolutionMethod2Question2 = simpleResolutionMethod2Question2;
    }

    public String getSimpleResolutionMethod3Question1() {
        return simpleResolutionMethod3Question1;
    }

    public void setSimpleResolutionMethod3Question1(String simpleResolutionMethod3Question1) {
        this.simpleResolutionMethod3Question1 = simpleResolutionMethod3Question1;
    }

    public String getSimpleResolutionMethod3Question2() {
        return simpleResolutionMethod3Question2;
    }

    public void setSimpleResolutionMethod3Question2(String simpleResolutionMethod3Question2) {
        this.simpleResolutionMethod3Question2 = simpleResolutionMethod3Question2;
    }

    public String getSimpleResolutionMethod4Question1() {
        return simpleResolutionMethod4Question1;
    }

    public void setSimpleResolutionMethod4Question1(String simpleResolutionMethod4Question1) {
        this.simpleResolutionMethod4Question1 = simpleResolutionMethod4Question1;
    }

    public String getSimpleResolutionMethod4Question2() {
        return simpleResolutionMethod4Question2;
    }

    public void setSimpleResolutionMethod4Question2(String simpleResolutionMethod4Question2) {
        this.simpleResolutionMethod4Question2 = simpleResolutionMethod4Question2;
    }

    public String getSimpleResolutionMethod3Tactic1Title() {
        return simpleResolutionMethod3Tactic1Title;
    }

    public void setSimpleResolutionMethod3Tactic1Title(String simpleResolutionMethod3Tactic1Title) {
        this.simpleResolutionMethod3Tactic1Title = simpleResolutionMethod3Tactic1Title;
    }

    public String getSimpleResolutionMethod3Tactic2Title() {
        return simpleResolutionMethod3Tactic2Title;
    }

    public void setSimpleResolutionMethod3Tactic2Title(String simpleResolutionMethod3Tactic2Title) {
        this.simpleResolutionMethod3Tactic2Title = simpleResolutionMethod3Tactic2Title;
    }

    public String getSimpleResolutionMethod4Tactic1SubTitle() {
        return simpleResolutionMethod4Tactic1SubTitle;
    }

    public void setSimpleResolutionMethod4Tactic1SubTitle(String simpleResolutionMethod4Tactic1SubTitle) {
        this.simpleResolutionMethod4Tactic1SubTitle = simpleResolutionMethod4Tactic1SubTitle;
    }

    public String getSimpleResolutionMethod3Tactic1SubTitle() {
        return simpleResolutionMethod3Tactic1SubTitle;
    }

    public void setSimpleResolutionMethod3Tactic1SubTitle(String simpleResolutionMethod3Tactic1SubTitle) {
        this.simpleResolutionMethod3Tactic1SubTitle = simpleResolutionMethod3Tactic1SubTitle;
    }

    public String getSimpleResolutionMethod3Tactic2SubTitle() {
        return simpleResolutionMethod3Tactic2SubTitle;
    }

    public void setSimpleResolutionMethod3Tactic2SubTitle(String simpleResolutionMethod3Tactic2SubTitle) {
        this.simpleResolutionMethod3Tactic2SubTitle = simpleResolutionMethod3Tactic2SubTitle;
    }

    public String getResolutionTacticJoinWord() {
        return resolutionTacticJoinWord;
    }

    public void setResolutionTacticJoinWord(String resolutionTacticJoinWord) {
        this.resolutionTacticJoinWord = resolutionTacticJoinWord;
    }

    public String getTabRuleTypeExecution() {
        return tabRuleTypeExecution;
    }

    public void setTabRuleTypeExecution(String tabRuleTypeExecution) {
        this.tabRuleTypeExecution = tabRuleTypeExecution;
    }

    public String getTabRuleTypePlanning() {
        return tabRuleTypePlanning;
    }

    public void setTabRuleTypePlanning(String tabRuleTypePlanning) {
        this.tabRuleTypePlanning = tabRuleTypePlanning;
    }

    public String getWordConflict() {
        return wordConflict;
    }

    public void setWordConflict(String wordConflict) {
        this.wordConflict = wordConflict;
    }

    public String getWordMethod() {
        return wordMethod;
    }

    public void setWordMethod(String wordMethod) {
        this.wordMethod = wordMethod;
    }

    public String getWordRuleTypeExecution() {
        return wordRuleTypeExecution;
    }

    public void setWordRuleTypeExecution(String wordRuleTypeExecution) {
        this.wordRuleTypeExecution = wordRuleTypeExecution;
    }

    public String getNewBestPractice() {
        return newBestPractice;
    }

    public void setNewBestPractice(String newBestPractice) {
        this.newBestPractice = newBestPractice;
    }

    public String getDefaultNodeTitleRule1Risk1() {
        return defaultNodeTitleRule1Risk1;
    }

    public void setDefaultNodeTitleRule1Risk1(String defaultNodeTitleRule1Risk1) {
        this.defaultNodeTitleRule1Risk1 = defaultNodeTitleRule1Risk1;
    }

    public String getDefaultNodeTitleRule1Risk2() {
        return defaultNodeTitleRule1Risk2;
    }

    public void setDefaultNodeTitleRule1Risk2(String defaultNodeTitleRule1Risk2) {
        this.defaultNodeTitleRule1Risk2 = defaultNodeTitleRule1Risk2;
    }

    public String getDefaultNodeTitleRule1Strategy1() {
        return defaultNodeTitleRule1Strategy1;
    }

    public void setDefaultNodeTitleRule1Strategy1(String defaultNodeTitleRule1Strategy1) {
        this.defaultNodeTitleRule1Strategy1 = defaultNodeTitleRule1Strategy1;
    }

    public String getDefaultNodeTitleRule1Strategy2() {
        return defaultNodeTitleRule1Strategy2;
    }

    public void setDefaultNodeTitleRule1Strategy2(String defaultNodeTitleRule1Strategy2) {
        this.defaultNodeTitleRule1Strategy2 = defaultNodeTitleRule1Strategy2;
    }

    public String getStep2bQuestion1() {
        return step2bQuestion1;
    }

    public void setStep2bQuestion1(String step2bQuestion1) {
        this.step2bQuestion1 = step2bQuestion1;
    }

    public String getStep2bQuestion2() {
        return step2bQuestion2;
    }

    public void setStep2bQuestion2(String step2bQuestion2) {
        this.step2bQuestion2 = step2bQuestion2;
    }

    public String getStep2bQuestion2Answer1() {
        return step2bQuestion2Answer1;
    }

    public void setStep2bQuestion2Answer1(String step2bQuestion2Answer1) {
        this.step2bQuestion2Answer1 = step2bQuestion2Answer1;
    }

    public String getStep2bQuestion2Answer2() {
        return step2bQuestion2Answer2;
    }

    public void setStep2bQuestion2Answer2(String step2bQuestion2Answer2) {
        this.step2bQuestion2Answer2 = step2bQuestion2Answer2;
    }

    public String getStep2bQuestion3() {
        return step2bQuestion3;
    }

    public void setStep2bQuestion3(String step2bQuestion3) {
        this.step2bQuestion3 = step2bQuestion3;
    }

//    public String getWordRuleTypePlanning() {
//        return wordRuleTypePlanning;
//    }

    public String getStep2bQuestion4() {
        return step2bQuestion4;
    }

    public void setStep2bQuestion4(String step2bQuestion4) {
        this.step2bQuestion4 = step2bQuestion4;
    }

    public String getConfirmResolutionOption3Question1() {
        return confirmResolutionOption3Question1;
    }

    public void setConfirmResolutionOption3Question1(String confirmResolutionOption3Question1) {
        this.confirmResolutionOption3Question1 = confirmResolutionOption3Question1;
    }

    public String getNecessaryAssumption() {
        return necessaryAssumption;
    }

    public void setNecessaryAssumption(String necessaryAssumption) {
        this.necessaryAssumption = necessaryAssumption;
    }

    public String getParallelAssumptions() {
        return parallelAssumptions;
    }

    public void setParallelAssumptions(String parallelAssumptions) {
        this.parallelAssumptions = parallelAssumptions;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getSufficiencyAssumptions() {
        return sufficiencyAssumptions;
    }

    public void setSufficiencyAssumptions(String sufficiencyAssumptions) {
        this.sufficiencyAssumptions = sufficiencyAssumptions;
    }

    public String getTactic() {
        return tactic;
    }

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }

    public String getAssumption() {
        return assumption;
    }

    public void setAssumption(String assumption) {
        this.assumption = assumption;
    }

    public String getInjection() {
        return injection;
    }

    public void setInjection(String injection) {
        this.injection = injection;
    }

    public String getHowTo() {
        return howTo;
    }

    public void setHowTo(String howTo) {
        this.howTo = howTo;
    }

    public String getStep1TheWhat() {
        return step1TheWhat;
    }

    public void setStep1TheWhat(String step1TheWhat) {
        this.step1TheWhat = step1TheWhat;
    }

    public String getStep2ATheWhat() {
        return step2ATheWhat;
    }

    public void setStep2ATheWhat(String step2ATheWhat) {
        this.step2ATheWhat = step2ATheWhat;
    }

    public String getStep2BTheWhat() {
        return step2BTheWhat;
    }

    public void setStep2BTheWhat(String step2BTheWhat) {
        this.step2BTheWhat = step2BTheWhat;
    }

    public String getStep31TheWhat() {
        return step31TheWhat;
    }

    public void setStep31TheWhat(String step31TheWhat) {
        this.step31TheWhat = step31TheWhat;
    }

    public String getStep32TheWhat() {
        return step32TheWhat;
    }

    public void setStep32TheWhat(String step32TheWhat) {
        this.step32TheWhat = step32TheWhat;
    }

    public String getStep33TheWhat() {
        return step33TheWhat;
    }

    public void setStep33TheWhat(String step33TheWhat) {
        this.step33TheWhat = step33TheWhat;
    }

    public String getStep34TheWhat() {
        return step34TheWhat;
    }

    public void setStep34TheWhat(String step34TheWhat) {
        this.step34TheWhat = step34TheWhat;
    }

    public String getStep3TheWhat() {
        return step3TheWhat;
    }

    public void setStep3TheWhat(String step3TheWhat) {
        this.step3TheWhat = step3TheWhat;
    }

    public String getStep4TheWhat() {
        return step4TheWhat;
    }

    public void setStep4TheWhat(String step4TheWhat) {
        this.step4TheWhat = step4TheWhat;
    }

    public String getStep5TheWhat() {
        return step5TheWhat;
    }

    public void setStep5TheWhat(String step5TheWhat) {
        this.step5TheWhat = step5TheWhat;
    }

    public String getJustDoItTheWhat() {
        return justDoItTheWhat;
    }

    public void setJustDoItTheWhat(String justDoItTheWhat) {
        this.justDoItTheWhat = justDoItTheWhat;
    }

    public String getApiBusinessConflict() {
        return apiBusinessConflict;
    }

    public void setApiBusinessConflict(String apiBusinessConflict) {
        this.apiBusinessConflict = apiBusinessConflict;
    }

    public String getApiPersonalConflict() {
        return apiPersonalConflict;
    }

    public void setApiPersonalConflict(String apiPersonalConflict) {
        this.apiPersonalConflict = apiPersonalConflict;
    }

    public String getApiTestDriveSuccessful() {
        return apiTestDriveSuccessful;
    }

    public void setApiTestDriveSuccessful(String apiTestDriveSuccessful) {
        this.apiTestDriveSuccessful = apiTestDriveSuccessful;
    }

    public String getApiTestDriveFeedbackStatusInvalid() {
        return apiTestDriveFeedbackStatusInvalid;
    }

    public void setApiTestDriveFeedbackStatusInvalid(String apiTestDriveFeedbackStatusInvalid) {
        this.apiTestDriveFeedbackStatusInvalid = apiTestDriveFeedbackStatusInvalid;
    }

    public String getApiTestDriveCategoryRequired() {
        return apiTestDriveCategoryRequired;
    }

    public void setApiTestDriveCategoryRequired(String apiTestDriveCategoryRequired) {
        this.apiTestDriveCategoryRequired = apiTestDriveCategoryRequired;
    }

    public String getApiDeviceTypeRequired() {
        return apiDeviceTypeRequired;
    }

    public void setApiDeviceTypeRequired(String apiDeviceTypeRequired) {
        this.apiDeviceTypeRequired = apiDeviceTypeRequired;
    }

    public String getTestDriveFeedbackYes() {
        return testDriveFeedbackYes;
    }

    public void setTestDriveFeedbackYes(String testDriveFeedbackYes) {
        this.testDriveFeedbackYes = testDriveFeedbackYes;
    }

    public String getTestDriveFeedbackNo() {
        return testDriveFeedbackNo;
    }

    public void setTestDriveFeedbackNo(String testDriveFeedbackNo) {
        this.testDriveFeedbackNo = testDriveFeedbackNo;
    }

    public String getTestDriveFeedbackGettingThere() {
        return testDriveFeedbackGettingThere;
    }

    public void setTestDriveFeedbackGettingThere(String testDriveFeedbackGettingThere) {
        this.testDriveFeedbackGettingThere = testDriveFeedbackGettingThere;
    }

    public String getTestDriveFeedbackSubmit() {
        return testDriveFeedbackSubmit;
    }

    public void setTestDriveFeedbackSubmit(String testDriveFeedbackSubmit) {
        this.testDriveFeedbackSubmit = testDriveFeedbackSubmit;
    }

    public String getTestDriveFeedbackComment() {
        return testDriveFeedbackComment;
    }

    public void setTestDriveFeedbackComment(String testDriveFeedbackComment) {
        this.testDriveFeedbackComment = testDriveFeedbackComment;
    }

    public String getTestDriveEaseOfUse() {
        return testDriveEaseOfUse;
    }

    public void setTestDriveEaseOfUse(String testDriveEaseOfUse) {
        this.testDriveEaseOfUse = testDriveEaseOfUse;
    }

    public String getTestDriveInsightsGained() {
        return testDriveInsightsGained;
    }

    public void setTestDriveInsightsGained(String testDriveInsightsGained) {
        this.testDriveInsightsGained = testDriveInsightsGained;
    }

    public String getTestDrivePrintAnalysis() {
        return testDrivePrintAnalysis;
    }

    public void setTestDrivePrintAnalysis(String testDrivePrintAnalysis) {
        this.testDrivePrintAnalysis = testDrivePrintAnalysis;
    }

    public String getTestDriveFeedbackTitle() {
        return testDriveFeedbackTitle;
    }

    public void setTestDriveFeedbackTitle(String testDriveFeedbackTitle) {
        this.testDriveFeedbackTitle = testDriveFeedbackTitle;
    }

    public String getTestDriveDoItYourself() {
        return testDriveDoItYourself;
    }

    public void setTestDriveDoItYourself(String testDriveDoItYourself) {
        this.testDriveDoItYourself = testDriveDoItYourself;
    }

    public String getTestDriveRegister() {
        return testDriveRegister;
    }

    public void setTestDriveRegister(String testDriveRegister) {
        this.testDriveRegister = testDriveRegister;
    }

    public String getTestDriveCancel() {
        return testDriveCancel;
    }

    public void setTestDriveCancel(String testDriveCancel) {
        this.testDriveCancel = testDriveCancel;
    }

    public String getTestDriveFeedbackNegativeMessage() {
        return testDriveFeedbackNegativeMessage;
    }

    public void setTestDriveFeedbackNegativeMessage(String testDriveFeedbackNegativeMessage) {
        this.testDriveFeedbackNegativeMessage = testDriveFeedbackNegativeMessage;
    }

    public String getTestDriveFeedbackPositiveMessage() {
        return testDriveFeedbackPositiveMessage;
    }

    public void setTestDriveFeedbackPositiveMessage(String testDriveFeedbackPositiveMessage) {
        this.testDriveFeedbackPositiveMessage = testDriveFeedbackPositiveMessage;
    }

    public String getTestDriveFeedbackNeutralMessage() {
        return testDriveFeedbackNeutralMessage;
    }

    public void setTestDriveFeedbackNeutralMessage(String testDriveFeedbackNeutralMessage) {
        this.testDriveFeedbackNeutralMessage = testDriveFeedbackNeutralMessage;
    }

    public String getTestDriveRegisterForStep35() {
        return testDriveRegisterForStep35;
    }

    public void setTestDriveRegisterForStep35(String testDriveRegisterForStep35) {
        this.testDriveRegisterForStep35 = testDriveRegisterForStep35;
    }

    public String getTestDriveWarning() {
        return testDriveWarning;
    }

    public void setTestDriveWarning(String testDriveWarning) {
        this.testDriveWarning = testDriveWarning;
    }

    public String getTestDriveSaveDecision() {
        return testDriveSaveDecision;
    }

    public void setTestDriveSaveDecision(String testDriveSaveDecision) {
        this.testDriveSaveDecision = testDriveSaveDecision;
    }

    public String getTestDriveSuggestion() {
        return testDriveSuggestion;
    }

    public void setTestDriveSuggestion(String testDriveSuggestion) {
        this.testDriveSuggestion = testDriveSuggestion;
    }

    public String getTestDriveComment() {
        return testDriveComment;
    }

    public void setTestDriveComment(String testDriveComment) {
        this.testDriveComment = testDriveComment;
    }

    public String getLabelOk() {
        return labelOk;
    }

    public void setLabelOk(String labelOk) {
        this.labelOk = labelOk;
    }

    //QPCC----------------------------------------------------------------------------------


    public String getDescisionCriteriaConsRatingQuestion() {
        return descisionCriteriaConsRatingQuestion;
    }

    public void setDescisionCriteriaConsRatingQuestion(String descisionCriteriaConsRatingQuestion) {
        this.descisionCriteriaConsRatingQuestion = descisionCriteriaConsRatingQuestion;
    }

    public String getDescisionCriteriaProsRatingQuestion() {
        return descisionCriteriaProsRatingQuestion;
    }

    public void setDescisionCriteriaProsRatingQuestion(String descisionCriteriaProsRatingQuestion) {
        this.descisionCriteriaProsRatingQuestion = descisionCriteriaProsRatingQuestion;
    }

    public String getCreateDecisionProcessConfirmationDialogText() {
        return createDecisionProcessConfirmationDialogText;
    }

    public void setCreateDecisionProcessConfirmationDialogText(String createDecisionProcessConfirmationDialogText) {
        this.createDecisionProcessConfirmationDialogText = createDecisionProcessConfirmationDialogText;
    }

    public String getCreateDecisionProcessConfirmationDialogBtnYes() {
        return createDecisionProcessConfirmationDialogBtnYes;
    }

    public void setCreateDecisionProcessConfirmationDialogBtnYes(String createDecisionProcessConfirmationDialogBtnYes) {
        this.createDecisionProcessConfirmationDialogBtnYes = createDecisionProcessConfirmationDialogBtnYes;
    }

    public String getCreateDecisionProcessConfirmationDialogBtnNo() {
        return createDecisionProcessConfirmationDialogBtnNo;
    }

    public void setCreateDecisionProcessConfirmationDialogBtnNo(String createDecisionProcessConfirmationDialogBtnNo) {
        this.createDecisionProcessConfirmationDialogBtnNo = createDecisionProcessConfirmationDialogBtnNo;
    }

    public String getMessengerConfirmationDialogText() {
        return messengerConfirmationDialogText;
    }

    public void setMessengerConfirmationDialogText(String messengerConfirmationDialogText) {
        this.messengerConfirmationDialogText = messengerConfirmationDialogText;
    }

    public String getMessengerConfirmationDialogBtnYes() {
        return messengerConfirmationDialogBtnYes;
    }

    public void setMessengerConfirmationDialogBtnYes(String messengerConfirmationDialogBtnYes) {
        this.messengerConfirmationDialogBtnYes = messengerConfirmationDialogBtnYes;
    }

    public String getMessengerConfirmationDialogBtnNo() {
        return messengerConfirmationDialogBtnNo;
    }

    public void setMessengerConfirmationDialogBtnNo(String messengerConfirmationDialogBtnNo) {
        this.messengerConfirmationDialogBtnNo = messengerConfirmationDialogBtnNo;
    }

    public String getDecisionCriteriaBusiness() {
        return decisionCriteriaBusiness;
    }

    public void setDecisionCriteriaBusiness(String decisionCriteriaBusiness) {
        this.decisionCriteriaBusiness = decisionCriteriaBusiness;
    }

    public String getDecisionCriteriaPersonal() {
        return decisionCriteriaPersonal;
    }

    public void setDecisionCriteriaPersonal(String decisionCriteriaPersonal) {
        this.decisionCriteriaPersonal = decisionCriteriaPersonal;
    }

    public String getDecisionCriteriaPERMAH() {
        return decisionCriteriaPERMAH;
    }

    public void setDecisionCriteriaPERMAH(String decisionCriteriaPERMAH) {
        this.decisionCriteriaPERMAH = decisionCriteriaPERMAH;
    }

    public String getDecisionCriteriaDetails() {
        return decisionCriteriaDetails;
    }

    public void setDecisionCriteriaDetails(String decisionCriteriaDetails) {
        this.decisionCriteriaDetails = decisionCriteriaDetails;
    }


    public String getDecisionCoachFeedbackSubmitted() {
        return decisionCoachFeedbackSubmitted;
    }

    public void setDecisionCoachFeedbackSubmitted(String decisionCoachFeedbackSubmitted) {
        this.decisionCoachFeedbackSubmitted = decisionCoachFeedbackSubmitted;
    }

    public String getDecisionCoachFeedbackFailed() {
        return decisionCoachFeedbackFailed;
    }

    public void setDecisionCoachFeedbackFailed(String decisionCoachFeedbackFailed) {
        this.decisionCoachFeedbackFailed = decisionCoachFeedbackFailed;
    }

    public String getSubmitHDMFeedbackDoYouLikeHDM() {
        return submitHDMFeedbackDoYouLikeHDM;
    }

    public void setSubmitHDMFeedbackDoYouLikeHDM(String submitHDMFeedbackDoYouLikeHDM) {
        this.submitHDMFeedbackDoYouLikeHDM = submitHDMFeedbackDoYouLikeHDM;
    }

    public String getSubmitHDMFeedbackThankYouForTheFeedback() {
        return submitHDMFeedbackThankYouForTheFeedback;
    }

    public void setSubmitHDMFeedbackThankYouForTheFeedback(String submitHDMFeedbackThankYouForTheFeedback) {
        this.submitHDMFeedbackThankYouForTheFeedback = submitHDMFeedbackThankYouForTheFeedback;
    }

    public String getSubmitHDMFeedbackMindMeGiveSomeComments() {
        return submitHDMFeedbackMindMeGiveSomeComments;
    }

    public void setSubmitHDMFeedbackMindMeGiveSomeComments(String submitHDMFeedbackMindMeGiveSomeComments) {
        this.submitHDMFeedbackMindMeGiveSomeComments = submitHDMFeedbackMindMeGiveSomeComments;
    }

    public String getSubmitHDMFeedbackItWillReallyHelpful() {
        return submitHDMFeedbackItWillReallyHelpful;
    }

    public void setSubmitHDMFeedbackItWillReallyHelpful(String submitHDMFeedbackItWillReallyHelpful) {
        this.submitHDMFeedbackItWillReallyHelpful = submitHDMFeedbackItWillReallyHelpful;
    }

    public String getSubmitHDMFeedbackRemindMeLater() {
        return submitHDMFeedbackRemindMeLater;
    }

    public void setSubmitHDMFeedbackRemindMeLater(String submitHDMFeedbackRemindMeLater) {
        this.submitHDMFeedbackRemindMeLater = submitHDMFeedbackRemindMeLater;
    }

    public String getSubmitHDMFeedbackNoThanks() {
        return submitHDMFeedbackNoThanks;
    }

    public void setSubmitHDMFeedbackNoThanks(String submitHDMFeedbackNoThanks) {
        this.submitHDMFeedbackNoThanks = submitHDMFeedbackNoThanks;
    }

    public String getSubmitHDMFeedbackPleaseProvideCommentFeedback() {
        return submitHDMFeedbackPleaseProvideCommentFeedback;
    }

    public void setSubmitHDMFeedbackPleaseProvideCommentFeedback(String submitHDMFeedbackPleaseProvideCommentFeedback) {
        this.submitHDMFeedbackPleaseProvideCommentFeedback = submitHDMFeedbackPleaseProvideCommentFeedback;
    }

    public String getHdMCoachDontRemindMeAgain() {
        return hdMCoachDontRemindMeAgain;
    }

    public void setHdMCoachDontRemindMeAgain(String hdMCoachDontRemindMeAgain) {
        this.hdMCoachDontRemindMeAgain = hdMCoachDontRemindMeAgain;
    }

    public String getHdMCoachCurrentlyHaveViewerLicense() {
        return hdMCoachCurrentlyHaveViewerLicense;
    }

    public void setHdMCoachCurrentlyHaveViewerLicense(String hdMCoachCurrentlyHaveViewerLicense) {
        this.hdMCoachCurrentlyHaveViewerLicense = hdMCoachCurrentlyHaveViewerLicense;
    }

    public String getHdMCoachCurrentlyHaveViewerLicenseThanks() {
        return hdMCoachCurrentlyHaveViewerLicenseThanks;
    }

    public void setHdMCoachCurrentlyHaveViewerLicenseThanks(String hdMCoachCurrentlyHaveViewerLicenseThanks) {
        this.hdMCoachCurrentlyHaveViewerLicenseThanks = hdMCoachCurrentlyHaveViewerLicenseThanks;
    }

    public String getHdMCoachThanks() {
        return hdMCoachThanks;
    }

    public void setHdMCoachThanks(String hdMCoachThanks) {
        this.hdMCoachThanks = hdMCoachThanks;
    }

    public String getShowcaseShowMeAround() {
        return showcaseShowMeAround;
    }

    public void setShowcaseShowMeAround(String showcaseShowMeAround) {
        this.showcaseShowMeAround = showcaseShowMeAround;
    }

    public String getShowcaseShowMeAroundOptionOne() {
        return showcaseShowMeAroundOptionOne;
    }

    public void setShowcaseShowMeAroundOptionOne(String showcaseShowMeAroundOptionOne) {
        this.showcaseShowMeAroundOptionOne = showcaseShowMeAroundOptionOne;
    }

    public String getShowcaseShowMeAroundOptionTwo() {
        return showcaseShowMeAroundOptionTwo;
    }

    public void setShowcaseShowMeAroundOptionTwo(String showcaseShowMeAroundOptionTwo) {
        this.showcaseShowMeAroundOptionTwo = showcaseShowMeAroundOptionTwo;
    }

    public String getShowcaseShowMeAroundOK() {
        return showcaseShowMeAroundOK;
    }

    public void setShowcaseShowMeAroundOK(String showcaseShowMeAroundOK) {
        this.showcaseShowMeAroundOK = showcaseShowMeAroundOK;
    }

    public String getShowcaseShowMeAroundLater() {
        return showcaseShowMeAroundLater;
    }

    public void setShowcaseShowMeAroundLater(String showcaseShowMeAroundLater) {
        this.showcaseShowMeAroundLater = showcaseShowMeAroundLater;
    }

    public String getStep3ChooseYourResolutionMethodDialogTitle() {
        return step3ChooseYourResolutionMethodDialogTitle;
    }

    public void setStep3ChooseYourResolutionMethodDialogTitle(String step3ChooseYourResolutionMethodDialogTitle) {
        this.step3ChooseYourResolutionMethodDialogTitle = step3ChooseYourResolutionMethodDialogTitle;
    }
}

