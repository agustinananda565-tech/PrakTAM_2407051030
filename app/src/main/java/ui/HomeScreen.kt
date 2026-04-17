package com.example.prak_mobile_2407051030.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.prak_mobile_2407051030.model.Goat
import com.example.prak_mobile_2407051030.model.GoatSource

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(GoatSource.listGoat) { goat ->
            GoatItem(goat)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun GoatItem(goat: Goat) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Image(
                painter = painterResource(id = goat.image),
                contentDescription = goat.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = goat.name,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleMedium
            )

            Text(text = goat.description)

            Text(
                text = goat.info,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Pelajari Tentang Reproduksi 🐐")
            }
        }
    }
}