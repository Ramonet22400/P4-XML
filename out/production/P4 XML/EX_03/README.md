## EX_03 P4: XML

*En este ejercicio lo que nos piden hacer es sumar una caracteristica más de los códgios anteriores. 
decir tendremos que crea una carpeta XMLs donde se guarden los documentos que utilizarán 
de path de la URL del sitemap correspondiente y dentro tendrán las URLs de las noticias.*


### *PASO A PASO:*

* Primero de todo tendremos que iniciar la clase que nos permitira iniciar la fábrica de documentos XML.
* Luego iniciaremos el DocumentBuilder para que este pueda analizar un archivo XML.
* Tendremos que abrir la URL mediante db.parse().
* Normalizamos el documento, puede ayudar en caso de tener XML mal formateado.
* Obtenemos la lista del sitemap.
* Crearemos un for que recorrera el sitemap buscando el termino loc.
* Este termino es lo que guarda las URL's que buscamos, y es por eso que las guardaremos en el String url_loc.
* url_loc se ira imprimiendo cada vez que pase el bucle, obteniendo las URL's del sitemap de la página web.
* Obtendermos la ruta de url_loc mediante la transformación de esta a URL(url_loc) y luego con el comando get.Path()
* Una vez obtenida esta URL, tendremos que crear un FILE donde gaurdar el path.

* Accederemos a las urls de cada URL anteriror medianta  NodeList list_node = doc2.getElementsByTagName("url").
* Crearemos un for que recorrera las URL nuevas guardandolas en un File en formato txt.