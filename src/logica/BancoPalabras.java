
package logica;
import modelo.Palabra;
import java.util.ArrayList;


public class BancoPalabras {//crea y gestiona el arrayList 
    
    private ArrayList<Palabra>palabras;
    
//crear lista vacia y llamar a cargarPalabras 
     public BancoPalabras(){
        palabras = new ArrayList<>();
        cargarPalabras();
    }
     
    public void cargarPalabras(){//llena mi arrayList palabras
        //Categoria VESTIMENTA:
        palabras.add(new Palabra("camisa","Vestimenta","Tiene más botones que muchos ascensores"));
        palabras.add(new Palabra("pantalon","Vestimenta","Vive abrazando dos piernas"));
        palabras.add(new Palabra("falda","Vestimenta","No necesita dos tubos para cubrir dos piernas"));
        palabras.add(new Palabra("vestido","Vestimenta","Una sola pieza y ya estás listo"));
        palabras.add(new Palabra("chaqueta","Vestimenta","Tu mejor amiga cuando hace frío"));
        palabras.add(new Palabra("corbata","Vestimenta","Accesorio elegante que no calienta nada"));
        palabras.add(new Palabra("sombrero","Vestimenta","Protege la cabeza y da estilo"));
        palabras.add(new Palabra("bufanda","Vestimenta","Abraza tu cuello todo el día"));
        palabras.add(new Palabra("guantes","Vestimenta","Cinco habitaciones para cada mano"));
        palabras.add(new Palabra("medias","Vestimenta","Siempre trabajan en pareja"));
        palabras.add(new Palabra("zapatos","Vestimenta","Viajan más kilómetros que tú"));
        palabras.add(new Palabra("sandalias","Vestimenta","Les gusta que los dedos respiren"));
        palabras.add(new Palabra("botas","Vestimenta","No le temen al lodo"));
        palabras.add(new Palabra("abrigo","Vestimenta","Tu escudo contra el invierno"));
        palabras.add(new Palabra("saco","Vestimenta","No guarda papas pero tiene el mismo nombre"));
        palabras.add(new Palabra("blusa","Vestimenta","Pariente elegante de la camiseta"));
        palabras.add(new Palabra("camiseta","Vestimenta","La más utilizada los fines de semana"));
        palabras.add(new Palabra("short","Vestimenta","Pantalón que se quedó sin tela"));
        palabras.add(new Palabra("sudadera","Vestimenta","La favorita para descansar"));
        palabras.add(new Palabra("uniforme","Vestimenta","Muchos lo usan para verse iguales"));
        palabras.add(new Palabra("reloj","Vestimenta","Siempre sabe la hora"));
        palabras.add(new Palabra("cinturon","Vestimenta","Mantiene todo en su lugar"));
        palabras.add(new Palabra("aretes","Vestimenta","Adornos colgantes en las orejas"));
        palabras.add(new Palabra("anillo","Vestimenta","Pequeño círculo con gran significado"));
        palabras.add(new Palabra("pulsera","Vestimenta","Abraza una muñeca"));
        palabras.add(new Palabra("collar","Vestimenta","Joya para el cuello"));
        palabras.add(new Palabra("gorra","Vestimenta","Versión deportiva del sombrero"));
        palabras.add(new Palabra("pijama","Vestimenta","Su jornada laboral empieza al dormir"));
        palabras.add(new Palabra("chaleco","Vestimenta","Chaqueta que olvidó las mangas"));
        palabras.add(new Palabra("impermeable","Vestimenta","La lluvia no le preocupa"));
        palabras.add(new Palabra("traje","Vestimenta","Viste de gala sin decir una palabra"));
        palabras.add(new Palabra("esmoquin","Vestimenta","Invitado frecuente de las alfombras rojas"));
        palabras.add(new Palabra("legging","Vestimenta","Muy usada para ejercicio"));
        palabras.add(new Palabra("tenis","Vestimenta","No solo es un deporte"));
        palabras.add(new Palabra("pantuflas","Vestimenta","Nunca salen de casa"));
        palabras.add(new Palabra("pañoleta","Vestimenta","Pequeña pero elegante"));
        palabras.add(new Palabra("calcetines","Vestimenta","Desaparecen misteriosamente en la lavadora"));
        palabras.add(new Palabra("bragas","Vestimenta","Prenda interior femenina"));
        palabras.add(new Palabra("boxer","Vestimenta","Comparte nombre con un deporte"));
        palabras.add(new Palabra("overol","Vestimenta","Prenda favorita en muchos talleres"));
        
        //Categoria PROFESIONES:
        palabras.add(new Palabra("doctor","Profesiones","Si no aparece en emergencia, todos se preocupan"));
        palabras.add(new Palabra("profesor","Profesiones","Intenta que aprendas aunque no quieras"));
        palabras.add(new Palabra("ingeniero","Profesiones","Ve soluciones donde otros ven problemas"));
        palabras.add(new Palabra("abogado","Profesiones","Discute profesionalmente"));
        palabras.add(new Palabra("arquitecto","Profesiones","Diseña sueños en forma de edificios"));
        palabras.add(new Palabra("contador","Profesiones","Se lleva bien con los números"));
        palabras.add(new Palabra("piloto","Profesiones","Trabaja donde los pájaros viven"));
        palabras.add(new Palabra("enfermero","Profesiones","Ayuda a sanar sin usar capa"));
        palabras.add(new Palabra("chef","Profesiones","Su oficina huele delicioso"));
        palabras.add(new Palabra("policia","Profesiones","Persigue problemas para resolverlos"));
        palabras.add(new Palabra("bombero","Profesiones","Corre hacia donde otros se alejan"));
        palabras.add(new Palabra("periodista","Profesiones","Pregunta más de lo normal"));
        palabras.add(new Palabra("mecanico","Profesiones","Escucha motores como si hablaran"));
        palabras.add(new Palabra("electricista","Profesiones","Trabaja con rayos domesticados"));
        palabras.add(new Palabra("dentista","Profesiones","Experto en sonrisas"));
        palabras.add(new Palabra("veterinario","Profesiones","Médico que no atiende humanos"));
        palabras.add(new Palabra("psicologo","Profesiones","Escucha más de lo que habla"));
        palabras.add(new Palabra("programador","Profesiones","Discute diariamente con errores invisibles"));
        palabras.add(new Palabra("carpintero","Profesiones","Convierte árboles en muebles"));
        palabras.add(new Palabra("astronauta","Profesiones","Su tráfico ocurre en el espacio"));
        palabras.add(new Palabra("actor","Profesiones","Vive muchas vidas sin dejar la suya"));
        palabras.add(new Palabra("cantante","Profesiones","Trabaja afinando la voz"));
        palabras.add(new Palabra("fotografo","Profesiones","Congela momentos"));
        palabras.add(new Palabra("panadero","Profesiones","Se despierta antes que el sol"));
        palabras.add(new Palabra("taxista","Profesiones","Conoce caminos y atajos"));
        palabras.add(new Palabra("albañil","Profesiones","Construye ciudades ladrillo a ladrillo"));
        palabras.add(new Palabra("jardinero","Profesiones","Hace crecer belleza"));
        palabras.add(new Palabra("traductor","Profesiones","Convierte idiomas en puentes"));
        palabras.add(new Palabra("cientifico","Profesiones","Hace preguntas difíciles todo el tiempo"));
        palabras.add(new Palabra("farmacéutico","Profesiones","Conoce remedios sin ser médico"));
        palabras.add(new Palabra("economista","Profesiones","Estudia cómo se mueve el dinero"));
        palabras.add(new Palabra("recepcionista","Profesiones","La primera cara de muchos lugares"));
        palabras.add(new Palabra("cajero","Profesiones","Guardián temporal del dinero"));
        palabras.add(new Palabra("conductor","Profesiones","Lleva pasajeros o mercancías"));
        palabras.add(new Palabra("minero","Profesiones","Trabaja buscando tesoros de la tierra"));
        palabras.add(new Palabra("pescador","Profesiones","Tiene mucha paciencia y pocas garantías"));
        palabras.add(new Palabra("locutor","Profesiones","Su voz es su herramienta principal"));
        palabras.add(new Palabra("barbero","Profesiones","Especialista en cabello y barba"));
        palabras.add(new Palabra("modelo","Profesiones","Trabaja frente a las cámaras"));
        palabras.add(new Palabra("bibliotecario","Profesiones","Rodeado de historias silenciosas"));
        
        
        //Categoria DEPORTES:
        palabras.add(new Palabra("futbol","Deportes","22 personas persiguiendo una pelota"));
        palabras.add(new Palabra("baloncesto","Deportes","La pelota sube más veces que un ascensor"));
        palabras.add(new Palabra("voleibol","Deportes","El suelo es lava para la pelota"));
        palabras.add(new Palabra("natacion","Deportes","Caminar era muy fácil, así que lo hicieron en agua"));
        palabras.add(new Palabra("ciclismo","Deportes","Dos ruedas, cero estabilidad al principio"));
        palabras.add(new Palabra("boxeo","Deportes","Aquí esquivar es tan importante como golpear"));
        palabras.add(new Palabra("tenis","Deportes","Una discusión elegante a raquetazos"));
        palabras.add(new Palabra("atletismo","Deportes","Correr porque sí"));
        palabras.add(new Palabra("rugby","Deportes","Parece fútbol, pero mucho más valiente"));
        palabras.add(new Palabra("beisbol","Deportes","Golpean una pelota para luego salir corriendo"));
        palabras.add(new Palabra("esgrima","Deportes","Pelear con espadas sin ser caballero medieval"));
        palabras.add(new Palabra("golf","Deportes","Mucho esfuerzo para una pelota pequeña"));
        palabras.add(new Palabra("karate","Deportes","Las manos también pueden ser herramientas"));
        palabras.add(new Palabra("judo","Deportes","La gravedad es tu mejor aliada"));
        palabras.add(new Palabra("taekwondo","Deportes","Las piernas hacen casi todo el trabajo"));
        palabras.add(new Palabra("ajedrez","Deportes","La guerra más silenciosa del mundo"));
        palabras.add(new Palabra("surf","Deportes","Intentar no caer mientras el mar conspira"));
        palabras.add(new Palabra("patinaje","Deportes","Caminar sobre ruedas parecía buena idea"));
        palabras.add(new Palabra("esqui","Deportes","Deslizarse montaña abajo voluntariamente"));
        palabras.add(new Palabra("levantamiento","Deportes","Mover cosas pesadas para impresionar"));
        palabras.add(new Palabra("gimnasia","Deportes","La flexibilidad llevada al extremo"));
        palabras.add(new Palabra("remo","Deportes","Avanzar empujando el agua"));
        palabras.add(new Palabra("clavados","Deportes","Lanzarse al agua con estilo"));
        palabras.add(new Palabra("handball","Deportes","Fútbol donde usar las manos sí está permitido"));
        palabras.add(new Palabra("waterpolo","Deportes","Natación con problemas adicionales"));
        palabras.add(new Palabra("automovilismo","Deportes","La velocidad hecha competencia"));
        palabras.add(new Palabra("motocross","Deportes","Lodo, motos y valentía"));
        palabras.add(new Palabra("parkour","Deportes","Convertir obstáculos en entretenimiento"));
        palabras.add(new Palabra("escalada","Deportes","El objetivo es subir y luego bajar"));
        palabras.add(new Palabra("paracaidismo","Deportes","Saltar primero, pensar después"));
        palabras.add(new Palabra("billar","Deportes","Geometría disfrazada de diversión"));
        palabras.add(new Palabra("bolos","Deportes","Derribar cosas legalmente"));
        palabras.add(new Palabra("softbol","Deportes","Primo cercano del béisbol"));
        palabras.add(new Palabra("lucha","Deportes","Ganar sin lanzar golpes"));
        palabras.add(new Palabra("hockey","Deportes","Perseguir un disco congelado"));
        palabras.add(new Palabra("cricket","Deportes","Muchos lo aman y pocos lo entienden"));
        palabras.add(new Palabra("triatlon","Deportes","Tres deportes porque uno no era suficiente"));
        palabras.add(new Palabra("badminton","Deportes","La pelota decidió convertirse en pluma"));
        palabras.add(new Palabra("canoaje","Deportes","Un bote y mucha coordinación"));
        palabras.add(new Palabra("capoeira","Deportes","Parece baile hasta que te golpean"));
        
        
        //Categoria COMIDAS:
        palabras.add(new Palabra("pizza","Comidas","Triángulos de felicidad"));
        palabras.add(new Palabra("hamburguesa","Comidas","Todo cabe entre dos panes"));
        palabras.add(new Palabra("lasagna","Comidas","Capas y más capas de sabor"));
        palabras.add(new Palabra("sushi","Comidas","El arroz decidió viajar a Japón"));
        palabras.add(new Palabra("arepa","Comidas","Orgullo nacional para muchos"));
        palabras.add(new Palabra("empanada","Comidas","La felicidad cabe en un bolsillo"));
        palabras.add(new Palabra("tamal","Comidas","Un regalo envuelto que sí se come"));
        palabras.add(new Palabra("arroz","Comidas","Acompaña más platos que cualquier amigo"));
        palabras.add(new Palabra("frijoles","Comidas","Pequeños pero poderosos"));
        palabras.add(new Palabra("sancocho","Comidas","Una reunión familiar dentro de una olla"));
        palabras.add(new Palabra("bandeja","Comidas","Antioquia en modo difícil"));
        palabras.add(new Palabra("spaghetti","Comidas","Comerlo sin ensuciarse es un mito"));
        palabras.add(new Palabra("helado","Comidas","Delicioso hasta que congela el cerebro"));
        palabras.add(new Palabra("chocolate","Comidas","La respuesta a muchos problemas"));
        palabras.add(new Palabra("galletas","Comidas","Difícil comer solo una"));
        palabras.add(new Palabra("sandwich","Comidas","Dos panes haciendo equipo"));
        palabras.add(new Palabra("ensalada","Comidas","La conciencia tranquila del almuerzo"));
        palabras.add(new Palabra("sopa","Comidas","Abrazo líquido"));
        palabras.add(new Palabra("pollo","Comidas","Antes caminaba, ahora almuerza"));
        palabras.add(new Palabra("carne","Comidas","Fuente clásica de proteína"));
        palabras.add(new Palabra("huevos","Comidas","Llegaron antes que la gallina"));
        palabras.add(new Palabra("burrito","Comidas","México envuelto en tortilla"));
        palabras.add(new Palabra("nachos","Comidas","Crujientes y sociables"));
        palabras.add(new Palabra("pan","Comidas","Compañero histórico del desayuno"));
        palabras.add(new Palabra("croissant","Comidas","Media luna de mantequilla"));
        palabras.add(new Palabra("waffle","Comidas","Cuadriculado y delicioso"));
        palabras.add(new Palabra("pancakes","Comidas","Tortas que prefieren el desayuno"));
        palabras.add(new Palabra("yogur","Comidas","Leche con una segunda oportunidad"));
        palabras.add(new Palabra("queso","Comidas","La leche evolucionó"));
        palabras.add(new Palabra("tacos","Comidas","Nunca vienen solos"));
        palabras.add(new Palabra("ceviche","Comidas","El limón hizo magia"));
        palabras.add(new Palabra("paella","Comidas","España mezcló todo y funcionó"));
        palabras.add(new Palabra("risotto","Comidas","Arroz elegante"));
        palabras.add(new Palabra("brownie","Comidas","Chocolate en su máxima expresión"));
        palabras.add(new Palabra("cupcake","Comidas","Torta en miniatura"));
        palabras.add(new Palabra("gelatina","Comidas","Tiembla más que algunos estudiantes"));
        palabras.add(new Palabra("manzana","Comidas","La fruta más famosa de los cuentos"));
        palabras.add(new Palabra("banano","Comidas","Los monos aprobaron este alimento"));
        palabras.add(new Palabra("papaya","Comidas","Tiene admiradores y enemigos"));
        palabras.add(new Palabra("sandia","Comidas","Agua disfrazada de fruta"));
        
        //Categoria PAISES:
        palabras.add(new Palabra("colombia","Paises","Donde el café tiene estatus de celebridad"));
        palabras.add(new Palabra("brasil","Paises","La samba nunca descansa"));
        palabras.add(new Palabra("argentina","Paises","El tango nació aquí"));
        palabras.add(new Palabra("chile","Paises","Tan largo que parece una fila"));
        palabras.add(new Palabra("peru","Paises","Machu Picchu vigila desde las alturas"));
        palabras.add(new Palabra("ecuador","Paises","La línea imaginaria le da nombre"));
        palabras.add(new Palabra("venezuela","Paises","Hogar del Salto Ángel"));
        palabras.add(new Palabra("mexico","Paises","Los mariachis son casi embajadores"));
        palabras.add(new Palabra("canada","Paises","La hoja de arce es una celebridad"));
        palabras.add(new Palabra("estadosunidos","Paises","Hollywood ayuda a reconocerlo"));
        palabras.add(new Palabra("francia","Paises","Una torre de hierro roba miradas"));
        palabras.add(new Palabra("alemania","Paises","Autos veloces y mucha ingeniería"));
        palabras.add(new Palabra("italia","Paises","La pizza empezó aquí"));
        palabras.add(new Palabra("españa","Paises","Flamenco y paella hacen equipo"));
        palabras.add(new Palabra("portugal","Paises","Vecino tranquilo de España"));
        palabras.add(new Palabra("inglaterra","Paises","El té es casi una tradición obligatoria"));
        palabras.add(new Palabra("irlanda","Paises","El color verde tiene ventajas aquí"));
        palabras.add(new Palabra("escocia","Paises","Las gaitas nunca pasan desapercibidas"));
        palabras.add(new Palabra("noruega","Paises","Las auroras bailan en el cielo"));
        palabras.add(new Palabra("suecia","Paises","IKEA ayudó a hacerlo famoso"));
        palabras.add(new Palabra("finlandia","Paises","Papá Noel recibe correo aquí"));
        palabras.add(new Palabra("dinamarca","Paises","La tierra de los vikingos modernos"));
        palabras.add(new Palabra("rusia","Paises","El mapa parece no terminar nunca"));
        palabras.add(new Palabra("china","Paises","La muralla se cansó de ser larga"));
        palabras.add(new Palabra("japon","Paises","Anime, tecnología y disciplina"));
        palabras.add(new Palabra("india","Paises","Uno de los lugares más poblados"));
        palabras.add(new Palabra("corea","Paises","El K-pop ayudó bastante a su fama"));
        palabras.add(new Palabra("tailandia","Paises","Templos y comida inolvidable"));
        palabras.add(new Palabra("australia","Paises","Los canguros tienen ciudadanía"));
        palabras.add(new Palabra("nuevazelanda","Paises","Tolkien ayudó con el turismo"));
        palabras.add(new Palabra("egipto","Paises","Las pirámides siguen sorprendiendo"));
        palabras.add(new Palabra("sudafrica","Paises","Tres capitales porque una no fue suficiente"));
        palabras.add(new Palabra("kenia","Paises","Muy cerca de grandes safaris"));
        palabras.add(new Palabra("marruecos","Paises","Puerta entre África y Europa"));
        palabras.add(new Palabra("turquia","Paises","Dos continentes se encuentran aquí"));
        palabras.add(new Palabra("grecia","Paises","Muchos dioses famosos vivían en sus historias"));
        palabras.add(new Palabra("suiza","Paises","Relojes y chocolate compiten por la fama"));
        palabras.add(new Palabra("austria","Paises","La música clásica dejó huella"));
        palabras.add(new Palabra("panama","Paises","Tiene un canal muy importante"));
        palabras.add(new Palabra("uruguay","Paises","Pequeño en tamaño, grande en fútbol"));
        
    }

 
    public Palabra obtenerPalabraAleatoria(){ 
        int tamaño = palabras.size();//obtiene cuantas palabras hay 
        int numAleatorio =(int)(Math.random()*(tamaño));//generamos indices validos aleatorios de mi lista de palabras
        Palabra palabraSeleccionda = palabras.get(numAleatorio);//obtenemos la palabra en esa posicion 
       return palabraSeleccionda;//devolvemos objeto palabra para mostrar la palabra aleatoria seleccionada.
    }

    
    }
    

