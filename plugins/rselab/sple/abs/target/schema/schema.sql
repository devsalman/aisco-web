CREATE TABLE ProgramImpl (
partner            VARCHAR(30)    DEFAULT '',
idProgram        INT        NOT NULL AUTO_INCREMENT,
name            VARCHAR(30)    DEFAULT '',
description        VARCHAR(30)    DEFAULT '',
logoUrl            VARCHAR(30)    DEFAULT '',
target            VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idProgram));

CREATE TABLE MoneyDonationImpl (
amount            INT        DEFAULT 0,
idProgram        INT        DEFAULT 0,
idMoneyDonation        INT        NOT NULL AUTO_INCREMENT,
accountNumber        VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idMoneyDonation));

CREATE TABLE IndividualBeneficiaryImpl (
address            VARCHAR(30)    DEFAULT '',
idIndividualBeneficiary    INT        NOT NULL AUTO_INCREMENT,
name            VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idIndividualBeneficiary));

CREATE TABLE AutomaticReportImpl (
publishDate        VARCHAR(30)    DEFAULT '',
title            VARCHAR(30)    DEFAULT '',
idSummary        INT        DEFAULT 0,
content            VARCHAR(30)    DEFAULT '',
idAutomaticReport    INT        NOT NULL AUTO_INCREMENT,
thumbnailUrl        VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idAutomaticReport));

CREATE TABLE SummaryImpl (
date            VARCHAR(30)    DEFAULT '',
income            INT        DEFAULT 0,
idProgram        INT        DEFAULT 0,
description        VARCHAR(30)    DEFAULT '',
expense            INT        DEFAULT 0,
idSummary        INT        NOT NULL AUTO_INCREMENT,
PRIMARY KEY (idSummary));

CREATE TABLE ExpenseImpl (
date            VARCHAR(30)    DEFAULT '',
amount            INT        DEFAULT 0,
idProgram        INT        DEFAULT 0,
idExpense        INT        NOT NULL AUTO_INCREMENT,
description        VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idExpense));

CREATE TABLE InstitutionalBeneficiaryImpl (
address            VARCHAR(30)    DEFAULT '',
phone            VARCHAR(30)    DEFAULT '',
name            VARCHAR(30)    DEFAULT '',
idInstitutionalBeneficiary    INT        NOT NULL AUTO_INCREMENT,
email            VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idInstitutionalBeneficiary));

CREATE TABLE ItemDonationImpl (
idItemDonation        INT        NOT NULL AUTO_INCREMENT,
itemName        VARCHAR(30)    DEFAULT '',
quantity        INT        DEFAULT 0,
idProgram        INT        DEFAULT 0,
PRIMARY KEY (idItemDonation));

CREATE TABLE ProductImpl (
name            VARCHAR(30)    DEFAULT '',
idProduct        INT        NOT NULL AUTO_INCREMENT,
description        VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idProduct));

CREATE TABLE ContinuousProgramImpl (
partner            VARCHAR(30)    DEFAULT '',
idContinuousProgram    INT        NOT NULL AUTO_INCREMENT,
endDate            VARCHAR(30)    DEFAULT '',
name            VARCHAR(30)    DEFAULT '',
description        VARCHAR(30)    DEFAULT '',
logoUrl            VARCHAR(30)    DEFAULT '',
target            VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idContinuousProgram));

CREATE TABLE DonorImpl (
address            VARCHAR(30)    DEFAULT '',
phone            VARCHAR(30)    DEFAULT '',
name            VARCHAR(30)    DEFAULT '',
idDonor            INT        NOT NULL AUTO_INCREMENT,
email            VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idDonor));

CREATE TABLE EventImpl (
date            VARCHAR(30)    DEFAULT '',
partner            VARCHAR(30)    DEFAULT '',
name            VARCHAR(30)    DEFAULT '',
idEvent            INT        NOT NULL AUTO_INCREMENT,
description        VARCHAR(30)    DEFAULT '',
logoUrl            VARCHAR(30)    DEFAULT '',
target            VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idEvent));

CREATE TABLE MemberNotificationImpl (
publishDate        VARCHAR(30)    DEFAULT '',
title            VARCHAR(30)    DEFAULT '',
idMemberNotification    INT        NOT NULL AUTO_INCREMENT,
idDonor            INT        DEFAULT 0,
content            VARCHAR(30)    DEFAULT '',
thumbnailUrl        VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idMemberNotification));

CREATE TABLE IncomeImpl (
date            VARCHAR(30)    DEFAULT '',
amount            INT        DEFAULT 0,
idProgram        INT        DEFAULT 0,
description        VARCHAR(30)    DEFAULT '',
idIncome        INT        NOT NULL AUTO_INCREMENT,
PRIMARY KEY (idIncome));

CREATE TABLE StoryBoardImpl (
idStoryBoard        INT        NOT NULL AUTO_INCREMENT,
idProgram        INT        DEFAULT 0,
publishDate        VARCHAR(30)    DEFAULT '',
title            VARCHAR(30)    DEFAULT '',
content            VARCHAR(30)    DEFAULT '',
thumbnailUrl        VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idStoryBoard));

CREATE TABLE ConfirmationImpl (
idConfirmation        INT        NOT NULL AUTO_INCREMENT,
amount            INT        DEFAULT 0,
idProgram        INT        DEFAULT 0,
accountNumber        VARCHAR(30)    DEFAULT '',
PRIMARY KEY (idConfirmation));

















