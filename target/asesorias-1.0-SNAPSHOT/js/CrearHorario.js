document.addEventListener("DOMContentLoaded", () => {
    const menuToggle = document.getElementById("menuToggle");
    const menu = document.getElementById("menu");
  
    menuToggle.addEventListener("click", () => {
      menu.classList.toggle("oculto");
    });
  });

  document.addEventListener("DOMContentLoaded", () => {
    const crearBtn = document.querySelector(".btn-crear");
  
    crearBtn.addEventListener("click", () => {
      const fechaInicio = document.getElementById("fechaInicio").value;
      const horaInicio = document.getElementById("horaInicio").value;
      const fechaFin = document.getElementById("fechaFin").value;
      const horaFin = document.getElementById("horaFin").value;
  
      if (!fechaInicio) {
        alert("Por favor, seleccione la fecha de inicio.");
        return;
      }
  
      if (!horaInicio) {
        alert("Por favor, seleccione la hora de inicio.");
        return;
      }
  
      if (!fechaFin) {
        alert("Por favor, seleccione la fecha de fin.");
        return;
      }
  
      if (!horaFin) {
        alert("Por favor, seleccione la hora de fin.");
        return;
      }
  
      
      alert("¡Horario creado correctamente!");
    });
  });
  