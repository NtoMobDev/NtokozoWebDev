package com.example.checkersclone.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ArrowDropDown
import androidx.compose.material.icons.sharp.LocationOn
import androidx.compose.material.icons.twotone.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.checkersclone.ui.theme.HeaderAddressBarGrey80
import com.example.checkersclone.ui.theme.HeaderGreen80
import com.example.checkersclone.ui.theme.HeaderGrey80
import com.example.checkersclone.ui.theme.ProfileBarGreen80

@Composable
fun HomeTopBar(modifier: Modifier = Modifier){
    Surface(modifier = Modifier.fillMaxWidth(), color = HeaderGrey80) {
        Column (){
            Row (horizontalArrangement = Arrangement.SpaceEvenly){
                HomeAddressInfo()
                ProfileInfo()
            }
        }
    }
}

@Composable
fun HomeAddressInfo(modifier: Modifier = Modifier){
    TextField(value = "", onValueChange = {} , colors = TextFieldDefaults.colors(
        focusedContainerColor = HeaderAddressBarGrey80,
        unfocusedContainerColor = HeaderAddressBarGrey80,
        unfocusedLeadingIconColor = HeaderGreen80,
        unfocusedTextColor = Color.White,
        unfocusedTrailingIconColor = Color.White),
        leadingIcon = {Icon(Icons.TwoTone.LocationOn,contentDescription = null, tint = HeaderGreen80)},
        trailingIcon = {Icon(Icons.Sharp.ArrowDropDown,contentDescription = null, tint = Color.White)},
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .clickable { },
    )

}

@Composable
fun ProfileInfo(modifier: Modifier = Modifier){
    Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(containerColor = ProfileBarGreen80, contentColor = Color.White),
        contentPadding = PaddingValues(5.dp),
        modifier = Modifier
            .clip(CircleShape)
            .size(50.dp)) {
        Text(text="NM", fontWeight = FontWeight.Bold, fontSize = 20.sp)


    }
}

@Composable
fun GroceryDeliveryInfo(modifier: Modifier = Modifier){

}

@Composable
fun HyperDeliveryInfo(modifier: Modifier = Modifier){

}