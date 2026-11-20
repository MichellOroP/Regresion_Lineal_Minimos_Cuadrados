
# Regresión Lineal por Mínimos Cuadrados

## Descripción
Proyecto de Métodos Numéricos, Unidad 5.

Implementación en Java de regresión lineal simple mediante el método de mínimos cuadrados, incluyendo el coeficiente de correlación de Pearson (r), el coeficiente de determinación (R²) y la predicción de valores.

## Objetivo
Calcular la ecuación de regresión lineal y analizar la relación entre dos variables mediante indicadores estadísticos.

## Tecnologías
- Java
- Visual Studio Code
- GitHub

## Estructura del proyecto

```text
Regresion_Lineal_Minimos_Cuadrados/
├── Ajuste_de_Funciones/
│   ├── Main.java
│   └── RegresionLineal.java
└── README.md
```

## Instrucciones de ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/MichellOroP/Regresion_Lineal_Minimos_Cuadrados.git
```

### 2. Entrar al proyecto

```bash
cd Regresion_Lineal_Minimos_Cuadrados
```

### 3. Compilar el programa

Se requiere tener instalado el JDK de Java.

```bash
javac Ajuste_de_Funciones/*.java
```

En PowerShell también se puede utilizar:

```powershell
javac Ajuste_de_Funciones/Main.java Ajuste_de_Funciones/RegresionLineal.java
```

### 4. Ejecutar

```bash
java Ajuste_de_Funciones.Main
```

## Datos de prueba

X = {1, 2, 3, 4, 5}

Y = {2, 4, 5, 4, 5}

## Resultados esperados

- Pendiente: 0.6000
- Ordenada al origen: 2.2000
- Modelo: Y = 2.2000 + 0.6000X
- Pearson (r): 0.7746
- Determinación (R²): 0.6000
- Predicción para X = 6: 5.8000

## Conclusión

La regresión lineal por mínimos cuadrados permite obtener un modelo matemático que describe la relación entre dos variables. El coeficiente de Pearson permite medir la fuerza y dirección de la relación lineal, mientras que R² indica la proporción de variabilidad explicada por el modelo.

## Asignatura

Métodos Numéricos - Unidad 5

Instituto Tecnológico Superior de Xalapa
