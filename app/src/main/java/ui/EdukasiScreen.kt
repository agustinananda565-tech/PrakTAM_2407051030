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
import com.example.prak_mobile_2407051030.model.Edukasi
import com.example.prak_mobile_2407051030.model.EdukasiSource

@Composable
fun TampilEdukasi() {
    val data = EdukasiSource.listEdukasi

    LazyColumn {
        items(data) { item ->
            ItemEdukasi(item)
        }
    }
}

@Composable
fun ItemEdukasi(edukasi: Edukasi) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Image(
                painter = painterResource(id = edukasi.imageRes),
                contentDescription = edukasi.judul,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = edukasi.judul)
            Text(text = edukasi.deskripsi)
        }
    }
}