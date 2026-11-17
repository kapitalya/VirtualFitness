# VirtualFitness

> App Android de seguimiento de entrenamiento (máquinas, records de fuerza y cardio, peso, medidas corporales y programas), derivada de un proyecto de terceros y de uso propio con mejoras.

**Estado (2026-11-17):** PARCIAL — la app Android heredada está completa (110 archivos Java, base SQLite local, importación y exportación CSV), pero la identidad del proyecto es inconsistente (ver "Estado y relaciones"), no hay CI y casi no hay pruebas.
**Repo:** kapitalya/VirtualFitness (**repositorio público**) · **Rama por defecto:** master · **Alias/nombres anteriores:** "VirtualFitness-master" (README anterior), `com.easyfitness` (applicationId), "Fast N Fitness" (nombre de la app en la compilación release)

## Qué hace

Registra entrenamientos en el dispositivo: máquinas y ejercicios, records de fuerza y cardio, peso, medidas corporales por parte del cuerpo, programas de entrenamiento y perfiles. Importa y exporta datos en CSV. No tiene backend: los datos viven en una base SQLite local.

## Stack

Android nativo en Java (`compileSdkVersion` 30, `minSdkVersion` 21, `targetSdkVersion` 30), Gradle, acceso a datos con DAO propios sobre SQLite, lectura y escritura CSV (`com.csvreader`), gráficos con MPAndroidChart, diálogo de licencias con `licensesdialog`, Firebase Crashlytics activado solo en compilaciones release (`FIREBASE_CRASH_ENABLED`). Pruebas con JUnit 4 y Mockito.

## Estructura

| Ruta | Contenido |
|---|---|
| `app/build.gradle` | Configuración del módulo (versión 0.20.3, código de versión 60) |
| `app/src/main/java/com/virtualfitness/` | Actividades, fragmentos, enums y utilidades |
| `app/src/main/java/com/virtualfitness/DAO/` | DAO y entidades (perfil, peso, máquinas, records, programas, medidas) |
| `app/src/main/java/com/csvreader/` | Lector y escritor CSV |
| `app/src/main/java/com/virtualfitness/licenses/` | Avisos de licencias de dependencias |
| `app/src/test/` | Una prueba (`MuscleTest`) |

## Instalación y uso

Este README no probó la compilación. Abrir el proyecto con Android Studio, o compilar con el wrapper de Gradle (`./gradlew assembleDebug`, requiere SDK de Android 30). La firma de release y debug se lee de `release.properties` y `debug.properties` si existen en la raíz; esos archivos no se versionan y no deben subirse.

## Variables de entorno (solo nombres)

Ninguna. La configuración de firma usa archivos locales (`release.properties`, `debug.properties`), no variables de entorno.

## Pruebas y CI

Una prueba unitaria (`app/src/test/.../enums/MuscleTest.java`). No hay `.github/workflows`: CI inexistente. No se ejecutó nada para esta documentación.

## Despliegue

Sin workflow ni configuración de despliegue en el repo. Distribución en tiendas: sin verificar (requiere observación externa a este repo).

## Estado y relaciones

- Sin relación con otros repos de Kapitalya (sin backend, sin ForexERP); aparente proyecto ajeno al portafolio.
- Identidad inconsistente, resto de un renombrado: `applicationId` `com.easyfitness`, `package` del manifiesto y rutas Java `com.virtualfitness`, y nombre de app "Fast N Fitness" en release.
- El repo es **público** y es un derivado de un proyecto de terceros (identificador `com.easyfitness`, nombres como `DAOFonte` y `CVSManager`). Proyecto de origen exacto, su licencia y su autor: sin verificar (el repo no los declara; requiere decisión del dueño e investigación externa).

## Precios y planes

Precios y planes: fuente única `Vault/EMPRESA/portafolio/PRECIOS-APROBADOS-20261108.md`. Este repo no define precios.

## Seguridad, privacidad y derechos

- **Derivado de un proyecto de terceros (`com.easyfitness`), de uso propio con mejoras. Sin LICENSE en el repo.** Este README no afirma derechos sobre el código original ni sobre su diseño.
- Repositorio público: no publicar claves de firma, `release.properties`, `debug.properties` ni configuración de Firebase con identificadores.
- Los datos de entrenamiento y medidas corporales son personales y quedan en el dispositivo; la compilación release envía reportes de fallos a Firebase Crashlytics.
- Pendiente del dueño: decidir si el repo sigue público, identificar la licencia del proyecto de origen y añadir la atribución que corresponda.

## Convenciones de trabajo

Ramas `codex/*`, PR contra la rama por defecto (no existe `develop`), CI verde cuando exista.
