document.addEventListener('DOMContentLoaded', function () {
    const formulario = document.getElementById('registroForm');
    const mensajeError = document.getElementById('mensajeError');

    // Contadores de caracteres
    const contadorNombres = document.getElementById('contadorNombres');
    const contadorApellidos = document.getElementById('contadorApellidos');
    const contadorDescripcion = document.getElementById('contadorDescripcion');

    // Validación en tiempo real para nombres
    document.getElementById('nombres').addEventListener('input', function () {
        const nombres = this.value;
        contadorNombres.textContent = `${nombres.length}/100`;
        validarCampo(this, nombres.length <= 100, 'Nombres no puede exceder 100 caracteres.', 'errorNombres');
    });

    // Validación en tiempo real para apellidos
    document.getElementById('apellidos').addEventListener('input', function () {
        const apellidos = this.value;
        contadorApellidos.textContent = `${apellidos.length}/100`;
        validarCampo(this, apellidos.length <= 100, 'Apellidos no puede exceder 100 caracteres.', 'errorApellidos');
    });

    // Validación en tiempo real para correo
    document.getElementById('correo').addEventListener('input', function () {
        const correo = this.value; // No convertir a mayúsculas
        const regexCorreo = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i; // Usar la bandera "i" para ignorar mayúsculas/minúsculas
        validarCampo(this, regexCorreo.test(correo), 'Correo no válido. Debe contener "@" y un punto después, sin espacios ni caracteres especiales.', 'errorCorreo');
    });

    // Validación en tiempo real para semestre
    document.getElementById('semestre').addEventListener('input', function () {
        const semestre = this.value.trim(); // Eliminar espacios en blanco
        const semestreNum = parseInt(semestre, 10); // Convertir a número
        validarCampo(this, !isNaN(semestreNum) && semestreNum >= 0 && semestreNum <= 16, 'Semestre debe ser un número entre 0 y 16.', 'errorSemestre');
    });

    // Validación en tiempo real para descripción
    document.getElementById('descripcion').addEventListener('input', function () {
        const descripcion = this.value;
        contadorDescripcion.textContent = `${descripcion.length}/500`;
        validarCampo(this, descripcion.length <= 500, 'Descripción no puede exceder 500 caracteres.', 'errorDescripcion');
    });

    // Validar el formulario al enviar
    formulario.addEventListener('submit', function (event) {
        event.preventDefault(); // Evitar envío automático

        // Validar todos los campos
        const nombres = document.getElementById('nombres');
        const apellidos = document.getElementById('apellidos');
        const correo = document.getElementById('correo');
        const semestre = document.getElementById('semestre');
        const descripcion = document.getElementById('descripcion');

        let esValido = true;

        // Validar nombres
        if (nombres.value.trim() === '' || nombres.value.length > 100) {
            validarCampo(nombres, false, 'Nombres es obligatorio y no puede exceder 100 caracteres.', 'errorNombres');
            esValido = false;
        }

        // Validar apellidos
        if (apellidos.value.trim() === '' || apellidos.value.length > 100) {
            validarCampo(apellidos, false, 'Apellidos es obligatorio y no puede exceder 100 caracteres.', 'errorApellidos');
            esValido = false;
        }

        // Validar correo
        const regexCorreo = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i;
        if (!regexCorreo.test(correo.value)) {
            validarCampo(correo, false, 'Correo no válido. Debe contener "@" y un punto después, sin espacios ni caracteres especiales.', 'errorCorreo');
            esValido = false;
        }

        // Validar semestre
        const semestreValor = semestre.value.trim(); // Eliminar espacios en blanco
        const semestreNum = parseInt(semestreValor, 10); // Convertir a número
        if (isNaN(semestreNum) || semestreNum < 0 || semestreNum > 16) {
            validarCampo(semestre, false, 'Semestre debe ser un número entre 0 y 16.', 'errorSemestre');
            esValido = false;
        }

        // Validar descripción
        if (descripcion.value.trim() === '' || descripcion.value.length > 500) {
            validarCampo(descripcion, false, 'Descripción es obligatoria y no puede exceder 500 caracteres.', 'errorDescripcion');
            esValido = false;
        }

        // Si el formulario es válido, enviarlo
        if (esValido) {
            alert('Formulario enviado correctamente.');
            formulario.submit(); // Enviar el formulario
        } else {
            alert('Por favor, corrige los errores antes de enviar el formulario.');
        }
    });

    // Función para validar un campo y mostrar errores
    function validarCampo(campo, esValido, mensaje, idError) {
        const errorElement = document.getElementById(idError);
        if (!esValido) {
            campo.style.borderColor = 'red';
            errorElement.textContent = mensaje;
            errorElement.style.color = 'red';
        } else {
            campo.style.borderColor = '';
            errorElement.textContent = '';
        }
    }
});