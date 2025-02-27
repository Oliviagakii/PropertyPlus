package com.example.propertyplus.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.ui.theme.purple20


@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text ="PropertyPlus",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.icon) ,
            contentDescription ="home",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text ="Manage your property with ease",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
        )
        Column {
            //Start of main Card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(50.dp),
                colors = CardDefaults.cardColors(purple20)
            ) {
                //Row1
                Row {
                    //Card1
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(20.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.icon1) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp),
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(modifier = Modifier.fillMaxWidth(),
                                text ="Home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )

                        }

                    }
                    //End of card
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(20.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.profile) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp),
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(modifier = Modifier.fillMaxWidth(),
                                text ="Home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )

                        }

                    }
                    //End of card
                }
                //End of Row

                //Row2
                Row {
                    //Card1
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(20.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.setting) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp),
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(modifier = Modifier.fillMaxWidth(),
                                text ="Home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )

                        }

                    }
                    //End of card
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(20.dp)
                            .clickable { navController.navigate(ROUT_HOME) }) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.login) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(100.dp),
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(modifier = Modifier.fillMaxWidth(),
                                text ="Home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )

                        }

                    }
                    //End of card
                }
            }


        }
    }







}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
