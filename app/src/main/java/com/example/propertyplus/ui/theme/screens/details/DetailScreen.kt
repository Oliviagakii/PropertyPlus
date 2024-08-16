package com.example.propertyplus.ui.theme.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController){

    Column (
        modifier = Modifier
            .fillMaxSize()

    ){
      TopAppBar(
          title = { Text(text = "Property PLus")},
          colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
          navigationIcon = {
              IconButton(onClick = { /*TODO*/ }) {
                  Icon(imageVector = Icons.Default.Menu, contentDescription = "menu", tint = Color.Cyan)

              }
          },
          actions = {
              IconButton(onClick = { /*TODO*/ }) {
                  Icon(imageVector = Icons.Default.Menu, contentDescription = "menu", tint = Color.Cyan)


          }
    })
       Box(modifier = Modifier.height(400.dp))


@Composable
@Preview(showBackground = true)
fun DetailScreenPreview(){
    DetailScreen(rememberNavController())
}}}





