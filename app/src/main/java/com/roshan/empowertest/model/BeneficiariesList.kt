package com.roshan.empowertest.model

/**
 * @author
 * Object of @BeneficiariesList is created.
 */
object BeneficiariesList {
    val detailList = listOf(
        Beneficiary(
            lastName = "Smith",
            firstName = "John",
            designationCode = 'P',
            beneType = "Spouse",
            socialSecurityNumber = "XXXXX3333",
            dateOfBirth = "04201979",
            middleName = "D",
            phoneNumber = "3035555555",
            beneficiaryAddress = BeneficiaryAddress(
                firstLineMailing = "8515 E Orchard Rd",
                scndLineMailing = null,
                city = "Greenwood Village",
                zipCode = "80111",
                stateCode = "CO",
                country = "US"
            )
        ),
        Beneficiary(
            lastName = "Smith",
            firstName = "Jane",
            designationCode = 'C',
            beneType = "Chile",
            socialSecurityNumber = "XXXXX4664",
            dateOfBirth = "01112012",
            middleName = "E",
            phoneNumber = "3034555555",
            beneficiaryAddress = BeneficiaryAddress(
                firstLineMailing = "8515 E Orchard Rd",
                scndLineMailing = null,
                city = "Greenwood Village",
                zipCode = "80111",
                stateCode = "CO",
                country = "US"
            )
        ),
        Beneficiary(
            lastName = "Smith",
            firstName = "Mary",
            designationCode = 'C',
            beneType = "Child",
            socialSecurityNumber = "XXXXX3645",
            dateOfBirth = "02122013",
            middleName = "E",
            phoneNumber = "2035557558",
            beneficiaryAddress = BeneficiaryAddress(
                firstLineMailing = "8515 E Orchard Rd",
                scndLineMailing = null,
                city = "Greenwood Village",
                zipCode = "80111",
                stateCode = "CO",
                country = "US"
            )
        ),
        Beneficiary(
            lastName = "Smith",
            firstName = "David",
            designationCode = 'C',
            beneType = "Child",
            socialSecurityNumber = "XXXXX7652",
            dateOfBirth = "09022013",
            middleName = "E",
            phoneNumber = "8094567777",
            beneficiaryAddress = BeneficiaryAddress(
                firstLineMailing = "8515 E Orchard Rd",
                scndLineMailing = null,
                city = "Greenwood Village",
                zipCode = "80111",
                stateCode = "CO",
                country = "US"
            )
        ),
        Beneficiary(
            lastName = "Smith",
            firstName = "Peter",
            designationCode = 'C',
            beneType = "Child",
            socialSecurityNumber = "XXXXX8756",
            dateOfBirth = "10052014",
            middleName = "E",
            phoneNumber = "8194587755",
            beneficiaryAddress = BeneficiaryAddress(
                firstLineMailing = "8515 E Orchard Rd",
                scndLineMailing = null,
                city = "Greenwood Village",
                zipCode = "80111",
                stateCode = "CO",
                country = "US"
            )
        ),
    )
}