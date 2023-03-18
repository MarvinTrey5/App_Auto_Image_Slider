package com.example.appslider;


import android.content.Context;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;


public class SlideAdapter extends PagerAdapter {
    // Datos a necesitar.
    // Array privado para los links del botón
    private ArrayList<String> lista_links;
    // Se necesitará un Context
    Context context;
    // Se necesita un LayoutInflater
    LayoutInflater myInflate;
    // Se crea la lista de imagenes
    public  int[] lista_Imagenes ={
            R.drawable.kimetsu, // 1
            R.drawable.hobbit, // 2
            R.drawable.anillos, // 3
            R.drawable.harry, // 4
            R.drawable.tormenta_perfecta, // 5
            R.drawable.piratas // 6
    };
    // Se crea la lista que almacena los Encabezados de cada imageView.
    // Para cada Imagen se le coloca su encabezado.
    public String[] lista_Encabezados = {
            "NOMBRE DE LA SERIE O PELICULA",
            "NOMBRE DE LA SERIE O PELICULA",
            "NOMBRE DE LA SERIE O PELICULA",
            "NOMBRE DE LA SERIE O PELICULA",
            "NOMBRE DE LA SERIE O PELICULA",
            "NOMBRE DE LA SERIE O PELICULA"
    };
    // Se crea una lista para el titulo de cada imagen.
    public String [] lista_Titulos = {
            "Kimetsu No Yaiba",
            "El Hobbit Un Viaje Inesperado",
            "El Señor De Los Anillos",
            "Harry Potter Y Las Reliquias De la Muerte Parte 2",
            "La Tormenta Perfecta",
            "Piratas Del Caribe La Maldición Del Perla Negra"
    };
    // Se crea una lista de Encabezado de Fecha de lanzamiento  de cada imagen.
    public String [] lista_Fecha = {
            "FECHA DE LANZAMIENTO",
            "FECHA DE LANZAMIENTO",
            "FECHA DE LANZAMIENTO",
            "FECHA DE LANZAMIENTO",
            "FECHA DE LANZAMIENTO",
            "FECHA DE LANZAMIENTO"
    };
    // Se crea una lista que mostrará la fecha de lanzamiento de cada imagen.
    public String [] lista_Lanzamiento= {
            "6 De Abril De 2019",
            "20 De Noviembre De 2012",
            "19 De Diciembre Del 2001",
            "15 De Julio Del 2011",
            "30 De Junio De 2000",
            "28 De Junio de 2003"
    };
    // se crea una lista de Encabezado de autores principales de cada imagen.
    public String [] lista_Principales = {
            "AUTORES PRINCIPALES",
            "AUTORES PRINCIPALES",
            "AUTORES PRINCIPALES",
            "AUTORES PRINCIPALES",
            "AUTORES PRINCIPALES",
            "AUTORES PRINCIPALES"
    };
    // Se crea una lista que mostrará los autores de cada imagen al cambiar de imagen
    // Como orden le damos un salto de linea para cada nombre.
    public String [] lista_Autores= {
            "Tanjiro Kamado  \n Nezuko Kamado \n Zenitsu Agatsuma",
            "Ian  Mckellen,\n Martin Freeman, \n Richard Armitage",
            "Elijah Wood \n Ian McKellen \n  Liv Tyler",
            "Daniel Radcliffe \n Rupert Grint \n Emma Watson",
            "George Clooney \n Mark Wahlberg \n Diane Lane",
            "Johnny Depp \n Geoffrey Rush \n Orlando Bloom"
    };
    // Se crea una lista de Encabezado de Descripcion de la serio o pelicula para cada imagen.
    public String [] lista_descripcion = {
            "DESCRIPCIÓN DE LA SERIE O DE PELICULA",
            "DESCRIPCIÓN DE LA SERIE O DE PELICULA",
            "DESCRIPCIÓN DE LA SERIE O DE PELICULA",
            "DESCRIPCIÓN DE LA SERIE O DE PELICULA",
            "DESCRIPCIÓN DE LA SERIE O DE PELICULA",
            "DESCRIPCIÓN DE LA SERIE O DE PELICULA"
    };
    // Se crea una lista de Descripcion de peliculas para cada imagen.
    public String [] lista_Descripcion = {
            "Tanjiro Kamado es un joven de una aldea pobre de algún lugar de las montañas del Japón lejos de la civilización el cual tras la muerte de su padre, se convierte en el hombre de la casa cuidando a su madre y sus hermanos menores mientras que sostiene a su familia mediante la venta de carbón.",
            "Comienza narrando la historia del fabuloso reino enano de Erebor, bajo la Montaña Solitaria, en la que los enanos extraían metales preciosos bajo el reinado de Thrór, el rey bajo la montaña.",
            "El Señor Oscuro Sauron forja el anillo Único en el Monte del Destino, infundiendo en él una gran parte de su poder para dominar, a través de él y a distancia, los otros Anillos, para que pueda conquistar la Tierra Media. ",
            "Dumbledore e introduce los recuerdos de Snape en el pensadero para observar en primer lugar cómo fue amigo y se enamoró de su madre cuando eran jóvenes. A continuación, un Snape ya adulto, por temor a que la profecía llevara a Voldemort a matar a Lilly, acude a Dumbledore para que la proteja y este pide a cambio su lealtad. ",
            "El barco permanece en Flemish Cap con sus bodegas casi llenas, pero un día mientras pescan, la máquina de hacer hielo se acaba averiando y les impide llenarlas a cabalidad. Thyne da el viaje por consolidado cuando recibe el aviso desesperado de una compañera de la llamada Tormenta del Siglo ",
            "J.Sparrow, quien está en el muelle tratando de hacerse con un barco, había observado la caída y se lanza al rescate de Elizabeth. Jack se da cuenta de que el vestido que lleva ella es demasiado pesado y resulta casi imposible mantenerla a flote, por lo que se las ingenia para quitárselo y dejarla sólo con el canesú interior."
    };
    // El constructor Silder como parámetro el Context
    public SlideAdapter (Context context){
        this.context = context;
        // Dentro de aquí se llama el array privado y se crea uno
        // nuevo.
        lista_links = new ArrayList<>();
        // Se añaden al array el link de cada sitio web de la imagen establecida .
        lista_links.add("https://kimetsu-no-yaiba.fandom.com/es/wiki/Kimetsu_no_Yaiba_Wiki");
        lista_links.add("https://seriesflix.uno/movies/el-hobbit-un-viaje-inesperado/");
        lista_links.add("https://www.sensacine.com/peliculas/pelicula-27070/");
        lista_links.add("https://www.vidaextra.com/guias-y-trucos/todas-peliculas-harry-potter-orden-cronologia-mundo-magico-fecha-estreno-a-traves-continuidad-oficial");
        lista_links.add("https://repelisflis.com/peliculas/la-tormenta-perfecta/");
        lista_links.add("https://www1.repelishd.io/pelicula/piratas-del-caribe-1-la-maldicion-del-perla-negra-online/");
    }
    @Override
    public int getCount() {
        // Retornará la longitud desde doonde inicia lista de titulos.
        return lista_Titulos.length;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return  ( view == (LinearLayout)object);
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        myInflate = (LayoutInflater) context.getSystemService(context. LAYOUT_INFLATER_SERVICE);
        // Se crea una vista de la pagina.
        View mostrar = myInflate.inflate(R.layout.slide, container, false);
        // Referenciamos todos los objetos diseñados en el Archivo XML.
        // con sus respectivos id.
        LinearLayout nuevo_layout = (LinearLayout) mostrar.findViewById(R.id.sildelinearlayout);
        ImageView Visualizar_Fotos = (ImageView) mostrar.findViewById(R.id.image_view);
        TextView encabezados = (TextView) mostrar.findViewById(R.id.Encabeza_Titulo);
        TextView titulos = (TextView) mostrar.findViewById(R.id.Ver_titulo);
        TextView Enca_extreno = (TextView) mostrar.findViewById(R.id.Encabeza_Fecha);
        TextView ver = (TextView)  mostrar.findViewById(R.id.Ver_Lanzamiento);
        TextView Enca_Autor = (TextView) mostrar.findViewById(R.id.Encabeza_Autores);
        TextView autores = (TextView)  mostrar.findViewById(R.id.Ver_Autor1);
        TextView Enca_Des = (TextView) mostrar.findViewById(R.id.Encabeza_Descripcion);
        TextView descripcion = (TextView) mostrar.findViewById(R.id.Ver_Descripcion);
        // Se referencia el botón.
        Button Web = (Button) mostrar.findViewById(R.id.btn_Boton);
        // Se obtiene el enlace que le corresponde a la lista de links del array añadido.
        final  String link = lista_links.get(position);
        // Funcionalidad al botón.
        Web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abrirá el enlace de los links de navegador al darle clic
                // al botón después de cambiar el slider.
                Intent paginas = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                context.startActivity(paginas);
            }
        });
        // Se mostrarán los datos de cada lista creada en cada TextView
        Visualizar_Fotos.setImageResource(lista_Imagenes[position]);
        encabezados.setText(lista_Encabezados[position]);
        titulos.setText(lista_Titulos[position]);
        Enca_extreno.setText(lista_Fecha[position]);
        ver.setText(lista_Lanzamiento[position]);
        Enca_Autor.setText(lista_Principales[position]);
        autores.setText(lista_Autores[position]);
        Enca_Des.setText(lista_descripcion[position]);
        descripcion.setText(lista_Descripcion[position]);
        // Agregará la vista de la página.
        container.addView(mostrar);
        // devolverá la vista de la página.
        return mostrar;
    }
    @Override
    public void destroyItem( ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
