package com.roshan.empowertest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roshan.empowertest.model.Beneficiary
import com.roshan.empowertest.model.BeneficiariesList
import com.roshan.empowertest.screen.BeneficiaryItemCard
import com.roshan.empowertest.ui.theme.EmpowerTestTheme

/**
 * @HomeScreen is a first screen where the list of @beneficiary is displayed in LazyColumn.
 */
class HomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val beneficiariesList = BeneficiariesList.detailList

        setContent {
            EmpowerTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BeneficiariesLazyColumn(beneficiariesList) {
                        startActivity(Intent(this, BeneficiaryDetailUI::class.java)
                            .apply {putExtra("bene",it)
                        })
                    }
                }
            }
        }
    }
}
@Composable
fun BeneficiariesLazyColumn(beneficiariesList : List<Beneficiary>, navigateToBeneficiariesDetails: (Beneficiary)-> Unit){
    LazyColumn(
        contentPadding = PaddingValues(5.dp)
    ){
        items(items = beneficiariesList,
        itemContent = {
            BeneficiaryItemCard(beneficiary = it, navigateToBeneficiariesDetails)
        })
    }
}