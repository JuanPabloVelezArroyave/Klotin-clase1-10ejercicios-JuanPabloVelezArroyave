# 🚀 Kit de Herramientas en Kotlin

¡Hola! Te comparto mi código. Lo pensé como mi propia **caja de herramientas** para no tener todo desordenado 
y poder reciclarlo cuando quiera.

### 📂 Orden de los ejercicios
Organicé todo paso a paso en mi función `main`, yendo de lo básico a lo avanzado:

1. **Saludo interactivo:** Pregunto nombre y edad.
2. **Calculadora:** Suma, resta, multiplica o divide.
3. **Clasificador de edad:** Decide si eres niño, adulto o mayor.
4. **Contador regresivo:** Cuenta hacia atrás (como un microondas).
5. **Promedio de notas:** Pide 5 calificaciones y saca el final.
6. **Validador seguro:** Protege el sistema si el usuario no escribe nada.
7. **Datos por defecto:** Autocompleta un perfil si faltan datos.
8. **Tabla de multiplicar:** Calcula la tabla de cualquier número.
9. **Conversor de clima:** Pasa de Celsius a Fahrenheit.
10. **Resumen integrador:** Une todo creando un perfil completo y clasificado.


### 📂 Cómo organicé mi código
*   **Herramientas (Funciones):** Saqué las funciones del bloque principal. 
    Creé "recetas" (para saludar, calcular, etc.) así puedo usarlas de nuevo sin reescribir nada.
*   **Director (`main`):** Al final dejé mi función `main`. Es mi jefe de orquesta que llama a 
    cada herramienta paso a paso, del ejercicio 1 al 10.

### 🧠 Lo que apliqué aquí
*   **Salvavidas (Null Safety):** Si olvido escribir mi edad, mi programa no explota. Le puse 
    un `?:` para que asuma que tengo 18. ¡Cero estrés!
*   **Semáforo (`when`):** En lugar de enredarme con muchos "si pasa esto", uso `when`. 
    Dirige el tráfico rápido según lo que yo elija en mi calculadora.
*   **Asistente (Bucles):** Con `for` y `while` no me repito. Si necesito pedir 5 notas, 
   le digo al programa que pregunte 5 veces.

### 💡 Ejemplo Real
Imagina que se abre un gimnasio. se puede tomar mi función `validador()` que ya armé aquí 
y usarla para registrar a mis clientes. Si dejan espacios en blanco, mi código ya sabe qué hacer sin fallar.

### 🛠️ pasos para probarlo 
1. **Copia** todo mi código.
2. **Abre** "Kotlin Playground" en tu navegador.
3. **Pega** el texto y dale a "Run".
4. **Juega** con la consola respondiendo las preguntas.