@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasiui.view


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.navigasiui.R

@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.home),
                    color = Color.White) },
                colors = TopAppBarDefaults
                    .topAppBarColors(containerColor = colorResource(id = R.color.teal_700))
            )
        }