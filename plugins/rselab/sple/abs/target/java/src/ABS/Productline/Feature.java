package ABS.Productline;
// abslang.abs:1110:0: 
public abstract class Feature extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isProgramData() { return this instanceof Feature_ProgramData; }
    public final Feature_ProgramData toProgramData() { return (Feature_ProgramData) this; }
    public final boolean isPeriodic() { return this instanceof Feature_Periodic; }
    public final Feature_Periodic toPeriodic() { return (Feature_Periodic) this; }
    public final boolean isEventual() { return this instanceof Feature_Eventual; }
    public final Feature_Eventual toEventual() { return (Feature_Eventual) this; }
    public final boolean isContinuous() { return this instanceof Feature_Continuous; }
    public final Feature_Continuous toContinuous() { return (Feature_Continuous) this; }
    public final boolean isPublicationSystem() { return this instanceof Feature_PublicationSystem; }
    public final Feature_PublicationSystem toPublicationSystem() { return (Feature_PublicationSystem) this; }
    public final boolean isMemberNotification() { return this instanceof Feature_MemberNotification; }
    public final Feature_MemberNotification toMemberNotification() { return (Feature_MemberNotification) this; }
    public final boolean isStoryBoard() { return this instanceof Feature_StoryBoard; }
    public final Feature_StoryBoard toStoryBoard() { return (Feature_StoryBoard) this; }
    public final boolean isAutomaticReport() { return this instanceof Feature_AutomaticReport; }
    public final Feature_AutomaticReport toAutomaticReport() { return (Feature_AutomaticReport) this; }
    public final boolean isFinancialReport() { return this instanceof Feature_FinancialReport; }
    public final Feature_FinancialReport toFinancialReport() { return (Feature_FinancialReport) this; }
    public final boolean isIncome() { return this instanceof Feature_Income; }
    public final Feature_Income toIncome() { return (Feature_Income) this; }
    public final boolean isExpense() { return this instanceof Feature_Expense; }
    public final Feature_Expense toExpense() { return (Feature_Expense) this; }
    public final boolean isDonor() { return this instanceof Feature_Donor; }
    public final Feature_Donor toDonor() { return (Feature_Donor) this; }
    public final boolean isSummary() { return this instanceof Feature_Summary; }
    public final Feature_Summary toSummary() { return (Feature_Summary) this; }
    public final boolean isObjectiveTarget() { return this instanceof Feature_ObjectiveTarget; }
    public final Feature_ObjectiveTarget toObjectiveTarget() { return (Feature_ObjectiveTarget) this; }
    public final boolean isProduct() { return this instanceof Feature_Product; }
    public final Feature_Product toProduct() { return (Feature_Product) this; }
    public final boolean isInstitutionalBeneficiary() { return this instanceof Feature_InstitutionalBeneficiary; }
    public final Feature_InstitutionalBeneficiary toInstitutionalBeneficiary() { return (Feature_InstitutionalBeneficiary) this; }
    public final boolean isIndividualBeneficiary() { return this instanceof Feature_IndividualBeneficiary; }
    public final Feature_IndividualBeneficiary toIndividualBeneficiary() { return (Feature_IndividualBeneficiary) this; }
    public final boolean isDonationData() { return this instanceof Feature_DonationData; }
    public final Feature_DonationData toDonationData() { return (Feature_DonationData) this; }
    public final boolean isMoney() { return this instanceof Feature_Money; }
    public final Feature_Money toMoney() { return (Feature_Money) this; }
    public final boolean isItem() { return this instanceof Feature_Item; }
    public final Feature_Item toItem() { return (Feature_Item) this; }
    public final boolean isConfirmation() { return this instanceof Feature_Confirmation; }
    public final Feature_Confirmation toConfirmation() { return (Feature_Confirmation) this; }
}
