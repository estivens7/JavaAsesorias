document.addEventListener("DOMContentLoaded", () => {
    const menuToggle = document.getElementById("menuToggle");
    const menu = document.getElementById("menu");
  
    menuToggle.addEventListener("click", () => {
      menu.classList.toggle("oculto");
    });
  });

  document.addEventListener("DOMContentLoaded", () => {
    const editarBtn = document.querySelector(".editar-btn");
  
    editarBtn.addEventListener("click", () => {
      const nombre = document.getElementById("nombre").value.trim();
      const correo = document.getElementById("correo").value.trim();
      const clave = document.getElementById("clave").value.trim();
  
      if (nombre === "") {
        alert("Por favor, complete el campo NOMBRE.");
        document.getElementById("nombre").focus();
        return;
      }
  
      if (correo === "") {
        alert("Por favor, complete el campo CORREO ELECTRÓNICO.");
        document.getElementById("correo").focus();
        return;
      }
  
      if (clave === "") {
        alert("Por favor, complete el campo CLAVE.");
        document.getElementById("clave").focus();
        return;
      }
  
      alert("Perfil actualizado correctamente.");
      
    });
  });
  