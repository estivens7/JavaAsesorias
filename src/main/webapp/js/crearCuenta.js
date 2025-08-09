document.addEventListener("DOMContentLoaded", () => {
    const form = document.querySelector("form");
  
    form.addEventListener("submit", (e) => {
      e.preventDefault(); 
  
      const nombre = document.getElementById("nombre").value.trim();
      const correo = document.getElementById("correo").value.trim();
      const clave = document.getElementById("clave").value.trim();
      const rol = document.getElementById("rol").value;
  
    
      if (nombre === "") {
        alert("Por favor, ingrese su nombre.");
        return;
      }
  
      if (correo === "") {
        alert("Por favor, ingrese su correo electrónico.");
        return;
      }
  
      if (clave === "") {
        alert("Por favor, ingrese su clave.");
        return;
      }
  
      if (rol === "") {
        alert("Por favor, seleccione un rol.");
        return;
      }
  
     
      alert("¡Cuenta creada exitosamente!");
      form.reset(); 
      window.location.href = "ingresarCuenta.html";
    });
  });
  