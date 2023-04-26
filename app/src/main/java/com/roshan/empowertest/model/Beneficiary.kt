package com.roshan.empowertest.model

import java.io.Serializable

class Beneficiary(
    val firstName : String,
    val middleName : String,
    val lastName : String,
    val designationCode : Char,
    val beneType : String,
    val socialSecurityNumber : String,
    val dateOfBirth : String,
    val phoneNumber : String,
    val beneficiaryAddress : BeneficiaryAddress
): Serializable