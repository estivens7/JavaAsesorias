document.addEventListener("DOMContentLoaded", () => {
  const form = document.querySelector("form");
  const usuarioInput = document.getElementById("usuario");
  const contraseñaInput = document.getElementById("contraseña");

  form.addEventListener("submit", (e) => {
    e.preventDefault();

    const usuario = usuarioInput.value.trim();
    const contraseña = contraseñaInput.value.trim();
    const rolSeleccionado = document.querySelector('input[name="rol"]:checked');

    if (usuario === "") {
      alert("Por favor, ingrese su usuario.");
      usuarioInput.focus();
      return;
    }

    if (contraseña === "") {
      alert("Por favor, ingrese su contraseña.");
      contraseñaInput.focus();
      return;
    }

    if (!rolSeleccionado) {
      alert("Por favor, seleccione si es Estudiante o Profesor.");
      return;
    }


  });
});
