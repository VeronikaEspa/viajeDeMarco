# Diagrama de flujo - El viaje de marco #
## Veronika Esparragoza ##

![Image text](https://github.com/VeronikaEspa/viajeDeMarco/blob/main/Veronika.Esparragoza/viaje%20de%20marco.png)

@startuml
!theme mars
title El viaje de Marco
start
:Inicio de la aventura;
:Distancia Madre:350 km;
repeat
:Velocidad Carruaje: de 6 a 9 km/h;
:Tiempo Carruaje: 6 a 9 horas;
if (¿Llueve fuerte?) then (yes)
:La velocidad Carruaje se disminuye un 50%;
else (no)
if (¿Llueve normal?) then (yes)
label lab
:La velocidad Carruaje se disminuye un 25%;
else (no)
label lab
label lab
:Buen clima;
endif
endif
break
:Marco busca a su madre;
:Velocidad: de 10 a 15 Km/h;
:Tiempo: de 8 a 10 horas;
if (¿Llueve fuerte?) then (yes)
:La velocidad se disminuye un 25%;
else (no)
if (¿Llueve normal?) then (yes)
label lab
:La velocidad se disminuye un 25%;
else (no)
label lab
label lab
:Buen clima;
endif
endif
if (¿El mono se cansó y se escapó el mismo dia?) then (yes)
:La velocidad se disminuye un 10%;
:El tiempo del niño se reduce 2 horas;
else (no)
if (¿El mono se escapó?) then (yes)
:El tiempo del niño se reduce 2 horas;
else (no)
label lab
if (¿El mono esta cansado?) then (yes)
label lab
:La velocidad se disminuye un 10%;
else (no)
label lab
endif
endif
endif
if (¿La distancia entre Marco y su Madre es > 50 km?) then (yes)
if (¿Marco encontró a alguien que ha visto a su madre?) then (yes)
:Recorre 25 km mas;
else (no)
:Sigue su recorrido;
endif
endif
repeat while (¿Marco encontró a su madre?) is (not) not (yes)
:¿Que dia es?;
:Alert "Final feliz, Marco encontró a su madre";
@enduml
