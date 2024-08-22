package com.example.ra3.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ra3.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


data class Miembro(
    val nombre: String,
    val grado: String,
    val grupo: String,
    val urlFoto: Int
)


class EquipoViewModel : ViewModel() {

    private val _equipo = MutableStateFlow<List<Miembro>>(emptyList())
    val equipo: StateFlow<List<Miembro>> = _equipo

    init {
        loadEquipoData()
    }

    private fun loadEquipoData() {

        viewModelScope.launch {
            val miembros = listOf(
                Miembro("Josafat de Jesus Lopez Trujillo", "9°", "B", R.drawable.josafat),

            )
            _equipo.value = miembros
        }
    }
}
