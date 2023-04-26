package com.roshan.empowertest.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.roshan.empowertest.model.Beneficiary

@Composable
fun BeneficiaryItemCard(
    beneficiary: Beneficiary,
    navigateToBeneficiariesDetails: (Beneficiary) -> Unit
){
    MaterialTheme {
        Card(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 10.dp)
                .fillMaxWidth()
                .clickable {
                           navigateToBeneficiariesDetails(beneficiary)
                },
            elevation = 2.dp,
            shape = RoundedCornerShape(corner = CornerSize(15.dp))

        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
            ){
                Text(text = "${beneficiary.firstName} ${beneficiary.lastName}", fontSize = 16.sp)
                if (beneficiary.designationCode == 'P'){
                    Text(text = "Designation : Primary", fontSize = 12.sp)
                }else{
                    Text(text = "Designation : Contingent", fontSize = 12.sp)
                }
                Text(text = "Beneficiary Type: " + beneficiary.beneType, fontSize = 12.sp)
            }
        }
    }
}

