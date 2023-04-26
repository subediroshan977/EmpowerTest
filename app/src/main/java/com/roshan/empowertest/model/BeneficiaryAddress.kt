package com.roshan.empowertest.model

import java.io.Serializable

data class BeneficiaryAddress(
    val firstLineMailing: String,
    val scndLineMailing: String?,
    val city: String,
    val zipCode: String,
    val stateCode: String,
    val country: String,
    ) : Serializable {
    override fun toString(): String {
        return "$firstLineMailing, $city, $zipCode, $stateCode, $country"
    }
}