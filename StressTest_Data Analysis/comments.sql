-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-04-2016 a las 19:15:05
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `stressdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comments`
--

CREATE TABLE IF NOT EXISTS `comments` (
  `id` int(120) NOT NULL AUTO_INCREMENT,
  `comment` varchar(65000) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=73 ;

--
-- Volcado de datos para la tabla `comments`
--

INSERT INTO `comments` (`id`, `comment`, `tipo`) VALUES
(1, 'no puedo pensar, lo siento ', 'Stress'),
(2, 'Es muy complicado el continuar la lectura como el texto cambia de pocicion y de color de fondo, el sonido tiende a ser molesto al inicio pero despues puede llegar a ser ignorado. lo más molesto fue el movimiento que tenia el texto de la lectura.', 'Stress'),
(3, 'Me parecio bastante molesto el hecho que el fondo cambiaba de color, pero lo que mas molesto me resulto fue el cambio de fuente causando que me perdiera a cada rato. Con respecto a los sonidos me privaron pensar correctamente por y analizar la informacion retenida al momento de la lectura. El sonido era molesto mas por el hecho de la intensidad de este. Ahora que lo he estado escuchando por mayor cantidad de tiempo, lo estoy empezando a ignorar, asi que aunque sigue siendo molesto por el alto volumen, no me afectan los sonidos en si. ', 'Stress'),
(4, 'esta prueba requiere de bastante analisis para poder responder ', 'Control'),
(5, 'No se puede razonar mientras se expone uno a este tipo de distraccion y mas cuando te distraes facilmente y tendes a pensar mas en lo que estas escucando que lo que lees. No pude realizar el razonamiento correctamente ya que la distraccion por los sonidos es demasiada, aparte de que no son sonidos normales y perturban. Dan ganas de quitarse los audifonos al leer la pregunta y realizar el razonamiento tranquilo.', 'Stress'),
(6, 'Este problema no es significantemente dificil, pero requiere de concentración, lo cual es dificil no solo con el sonido, sino con las luces cambiantes de la pantalla. Personalmente fue un poco dificil llegar a una conclusion principalmente por las luces.', 'Stress'),
(7, 'Conmosión por los sonidos elevados y el cambio de letra. No permiten la consentración. ', 'Stress'),
(8, 'El caso en sí está raro debido a que uno no se sabe cual es el nombre de las puertas, son dos pero al final solo sabemos el nombre de una de las puertas por lo que el nombre de la otra puerta puede ser cualquiera. \r\nEl cambio de letras fue lo más molesto. \r\n', 'Stress'),
(9, 'la parte mas dificil para mi fue el cambio de colores porque alteraba el texto, el ruido no es tanto mi obstaculo, pero los coles casi no me dejaron leer me moleste al no poder leer ', 'Stress'),
(10, 'Mucha sobrecarga de información que no deja de pensar de manera clara, concreta y concisa', 'Stress'),
(11, 'Considero que es problematico leer el texto si este se encuentra en movimiento puesto desvia la lectura al no encontrarse en el mismo espacio. ', 'Stress'),
(12, 'estuvo interesante', 'Stress'),
(13, 'El cambio del color de fondo era algo confuso.', 'Stress'),
(14, 'No soporto el sonido.', 'Stress'),
(15, 'es muy interesante ver como nos desconcentramos con los sonidos, además es muy díficil cuando todo esta en movimiento constante. ', 'Stress'),
(16, '', 'Stress'),
(17, 'El cambio de grosor de letra y de colores en la pantalla dificulta un poco la lectura de las palabras, además los sonidos son "asfixiantes" los cuales tienden a distraerte. Al momento de pensar en la respuesta correcta es complicado poner atención a lo que estas haciendo por los sonidos mencionados anteriormente.', 'Stress'),
(18, 'Al principio sentí fácil la pregunta porque no ví el tiempo, pero cuando ví que solo tenía un tiempo limitado, empecé a leer más rápido y las ideas que tenía se empezaron a juntar y tuve que volver a leer todo para volver a formar ideas y poder responder bien.', 'Control'),
(19, 'Es demasiado dificil de responder con los sonidos y el movimiento de las letras. El cambio del texto, de normal a cursiva también es un elemento que hace dificil de procesar la información y responder a la pregunta. ', 'Stress'),
(20, 'Los sonidos no fueron tan molestos, sin embargo el cambio de letra y color si confundían de gran manera y costaba concentrarse en leer el texto.', 'Stress'),
(21, '', 'Stress'),
(22, 'Ya conocia este test', 'Control'),
(23, 'Al inicio el ruido era muy abrumador y no permitía concentrarse. Después de un tiempo la molestia se hizo menor pero seguía siendo significativa. El cambio de contrastes de los colores lastimaba la vista. Lo más difícil para mí fue el cambio de fuente que existía en la pantalla, porque movía las letras y no permitía que leyera bien, sino que movía la vista de un lado a otro. Las instrucciones del problema me parecieron confusas, seguramente por ser el problema de lógica, pero que las mujeres se sentaran "detrás" de los hombres y que más adelante hablaran de asientos contiguos fue lo que me confundió más. El temporizador lo ví hasta que faltaron unos 2 minutos, pero no le presté mucha atención, seguramente por donde estaba, pues seguía las instrucciones que estaban más abajo, donde se concentraba mi vista. ', 'Stress'),
(24, 'que estres no me puedo concentrar me tendria q acostumbrar a los sonidos y al cambio de letra los colores no representan un problema', 'Stress'),
(25, 'esta interesante la tortura tipo guantanamo', 'Stress'),
(26, 'Me pareció que el test tiene una dificultad alta, aún mas si una persona se distrae con facilidad.', 'Control'),
(27, 'Escribir con mucho ruido, especialmente los agudos son incomodos. el cambio del tamaño de letra retrasa la lectura y marea un poco. El color del fondo no unfluye mucho. ', 'Stress'),
(28, 'Los ruidos son los que mas afectan y el cambio de letra hace mas dificiil que se lea el problema', 'Stress'),
(29, 'que interesante como el color cambia y la fuente de la letra para confundir a las personas ', 'Stress'),
(30, 'me costó bastante lograr conseguir la concentración necesaria para realizar este experomento debido al cambio de color y letra que alteraba mi percepción, además el sonido irritante del fondo distrae mis ideas ya que me concentro en lo que escucho. buen experimento, en algo tan sencillo como ordenar logicamente se vio alterado por modificar las carateristicas del medio. ', 'Stress'),
(31, 'La prueba es interesante.', 'Control'),
(32, 'Es muy complicado leer mientras se esta cambiando de imagen y cuesta concentrarse. También el sonido tan abrumador distrae y te hace querer terminar lo más pronto posible de contestar. No creo haber contestado bien.', 'Stress'),
(33, 'Se volvió algo desesperante escuchar el sonido y que la letra y el color del fondo cambiaran', 'Stress'),
(35, 'Es muy difícil concentrarse con tanto ruido y que las letras se muevan', 'Stress'),
(36, 'Me sentí confundido y perdido, es más, creo que tengo mala la respuest, ya que tomo estas cosas como un examen, y en los exámenes me congelo.', 'Control'),
(37, 'es una prueba de dificultad media ya que en esta no te dan claro los datos y uno tiene que estar haciendo suposiciones en cada momento', 'Control'),
(38, 'El problema es de razonamiento logico requiere estar bastante concentrado. Me senti un bajo presion al saber que requeria tiempo. Me gustan mucho los problemas de juegos mentales y analisis. ', 'Control'),
(39, '', 'Control'),
(40, 'Con sonidos de la naturaleza, me logre concentrar. En el caso contrario de sonidos caoticos, crearia cierta presion o ansidad para contestar el test. ', 'Control'),
(41, 'era un poco díficil por el cambio en el tamaño de la tipográfia y el cambio de color , no tanto por los sonidos. ', 'Stress'),
(42, 'Me resultó muy díficil leer el texto por los cambios de color y letras. También por los sonidos molestos.', 'Stress'),
(43, 'Me parecio interesante el experimento.', 'Control'),
(44, '', 'Stress'),
(45, 'la libertad del hombre depende las opciones que se le dan, sin embargo, no todos tienen la mismas opciones en la vida', 'Stress'),
(46, 'si me costo mucho analizarlo  por el cambio de colores y el sonido ', 'Stress'),
(47, '', 'Control'),
(48, '', 'Control'),
(49, 'Es una situación muuy incómoda y la verdad es que me puso a prueba porque de por si padezco de ansiedad y el hecho de estar escuchando cosas irritantes por los audifonos y diferentes colores y letra en la pantalla simplemente me hizo poner cualquier nombre en la respuesta para poder terminar este test. ', 'Stress'),
(50, 'Mucho ruido!', 'Stress'),
(51, 'es un poco dificil concentrarse con el ruido de los audifonos, sin embargo uno se puede acostumbrar y no molesta tanto. Lo que si molesta es que el tipo de letra ese cambiando, lo cual lo desenfoca a uno y hace que tenga que buscar donde se quedo.', 'Stress'),
(52, 'Ls prueba es algo molesta pero al mismo tiempo me llama la atención el tratar de mantener la concentración mientras existen sonidos molestos y efectos visuales que distraen al ojo humano. Al principio cuesta concentrarse pero después de un rato uno se acostumbra a los sonidos y se concentra más facilmente.', 'Stress'),
(53, 'Me fue dificil concentrarme con la musica, porque aunque estaba relajado, estaba demasiado relajado y pensaba más en la música que en el problema. Pero me gustó la prueba.', 'Control'),
(54, 'Obtener la respuesta es mucho más díficil por el hecho que los caracteres cambian de cursiva a normal, los sonidos y colores no llegaron a afectar mucho como resolver el problema. ', 'Stress'),
(55, 'No estoy concentrada.', 'Stress'),
(56, '', 'Stress'),
(57, 'estresante', 'Stress'),
(58, 'costo por los colores que se cambiaba del fondo y el el tipo de letra para oder encontrar la respuesta y esto distraia mucho al poder encontrar la respuesta.', 'Stress'),
(59, 'Fue dificl leer por el movimiento y el cambio de colores de las letras, pero mas por el ruido constante que no permitia la concentracion', 'Stress'),
(60, '', 'Control'),
(61, 'Leer costaba porque cambio de tramaño de letra', 'Stress'),
(62, 'Estaba mintiendo. ', 'Control'),
(63, 'Si cuesta leer un poco, pero al encontrar el patron uno sabe donde queda la lectura. ', 'Stress'),
(64, 'La prueba me parecio corta e interesante aunque crei que iban a poner sonidos o algun tipo de actividad que me confundiera en la decision a tomar', 'Control'),
(65, '', 'Stress'),
(66, 'Hay un guardia que siempre miente', 'Control'),
(67, 'Me aturdieron demasiado los ruidos que se escuchaban al fondo, me parecio muy desesperante y durante la prueba no oude concentrarme por lo que creo que mi prueba fue erronea. La abandone porque no me gustaron esos ruidos. ', 'Stress'),
(68, '', 'Stress'),
(69, 'Me sentí tranquila al leer.', 'Control'),
(70, '', 'Stress'),
(71, '', 'Stress'),
(72, 'El principal problema del test es el sonido del niño tonto que como llora, no se si me caen mal los niños pero no puedo pensar con ese ruido asqueroso\r\n', 'Stress');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
