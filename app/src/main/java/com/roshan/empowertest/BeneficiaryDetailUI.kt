package com.roshan.empowertest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.roshan.empowertest.model.Beneficiary
import com.roshan.empowertest.ui.theme.EmpowerTestTheme
import com.roshan.empowertest.ui.theme.Silver

/**
 * BeneficiaryDetailUI is a Detail Screen where the more details about the @beneficiary is displayed.
 */
class BeneficiaryDetailUI : ComponentActivity() {

    private val beneficiary : Beneficiary by lazy {
        intent?.getSerializableExtra("bene") as Beneficiary
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmpowerTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Silver
                ) {
                    BeneficiaryDetailItemCard(beneficiary = beneficiary)
                }
            }
        }
    }
}

/**
 * BeneficiaryDetailItem Card is a card where the more details about the @beneficiary is displayed which includes
 * beneficiary name, dob, address, ssn, and soon.
 */
@Composable
fun BeneficiaryDetailItemCard(
    beneficiary: Beneficiary){
    MaterialTheme {
        Card(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 10.dp)
                .fillMaxWidth()
                .wrapContentHeight(align = CenterVertically),
            elevation = 2.dp,
            shape = RoundedCornerShape(corner = CornerSize(15.dp))

        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
                modifier = Modifier.padding(horizontal = 5.dp, vertical = 5.dp)
            ){
                Text(text = "${beneficiary.firstName} ${beneficiary.lastName}", fontSize = 16.sp)
                if (beneficiary.designationCode == 'P'){
                    Text(text = "Designation : Primary", fontSize = 12.sp)
                }else{
                    Text(text = "Designation : Contingent", fontSize = 12.sp)
                }
                Text(text = "SSN: " + beneficiary.socialSecurityNumber, fontSize = 12.sp)
                Text(text = "DOB:  ${beneficiary.dateOfBirth.substring(0,2)}/${beneficiary.dateOfBirth.substring(2,4)}/${beneficiary.dateOfBirth.substring(4,8)} ", fontSize = 12.sp)
                Text(text = "Phone No.: " + beneficiary.phoneNumber, fontSize = 12.sp)
                Text(text = "Address: ${beneficiary.beneficiaryAddress.toString()}", fontSize = 12.sp)
            }
        }
    }
}

