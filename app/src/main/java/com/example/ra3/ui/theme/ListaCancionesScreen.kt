package com.example.ra3.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.tv.material3.Text
import com.example.ra3.R
import com.example.ra3.model.Cancion

@Composable
fun ListaCancionesScreen(onCancionSelected: (Cancion) -> Unit, onSalir: () -> Unit) {
    val canciones = listOf(
        Cancion(1, "LA DURANGO", R.drawable.exodo, "En 'LA DURANGO', Peso Pluma se une a Junior H y Eslabón Armado para crear un corrido moderno que resalta la vida en el norte de México, combinando su característico estilo con letras contundentes."),
        Cancion(2, "ME ACTIVO", R.drawable.exodo, "Peso Pluma y Jasiel Nuñez colaboran en 'ME ACTIVO', una canción llena de energía que habla sobre la vida en movimiento y la constante búsqueda de más. Un tema que refleja la determinación y el ritmo vertiginoso de sus vidas."),
        Cancion(3, "LA PATRULLA", R.drawable.exodo, "Con 'LA PATRULLA', Peso Pluma y Neton Vega presentan un corrido con un toque urbano, narrando historias de calle y superación con un ritmo que mantiene al oyente atento desde el primer segundo."),
        Cancion(4, "LA PEOPLE II", R.drawable.exodo, "Peso Pluma, Tito Double P, y Joel De La P se unen en 'LA PEOPLE II', una continuación de su éxito anterior que sigue explorando la vida y los desafíos de los barrios populares, con una mezcla de estilos que hacen vibrar."),
        Cancion(5, "SR. SMITH", R.drawable.exodo, "En 'SR. SMITH', Peso Pluma y Luis R Conriquez se adentran en una historia de poder y respeto, con letras que describen la vida de un personaje influyente en su comunidad."),
        Cancion(6, "ROMPE LA DOMPE", R.drawable.exodo, "Peso Pluma, Junior H, y Óscar Maydon nos traen 'ROMPE LA DOMPE', un tema que fusiona corridos con ritmos urbanos para contar una historia de resistencia y triunfo en tiempos difíciles."),
        Cancion(7, "MAMI", R.drawable.exodo, "En 'MAMI', Peso Pluma y Chino Pacas combinan sus estilos para crear una canción dedicada al amor y al deseo, con una melodía pegajosa y un ritmo que invita a moverse."),
        Cancion(8, "BELANOVA", R.drawable.exodo, "Peso Pluma y Tito Double P rinden homenaje al icónico grupo Belanova en esta canción, 'BELANOVA', que fusiona elementos del pop con su estilo característico, resultando en un tema nostálgico y fresco."),

        )

    LazyColumn {
        items(canciones) { cancion ->
            Button(
                onClick = { onCancionSelected(cancion) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = cancion.titulo)
            }
        }

        // Botón de salir
        item {
            Button(
                onClick = { onSalir() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Salir")
            }
        }
    }
}
