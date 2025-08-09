document.addEventListener("DOMContentLoaded", () => {
    const menuToggle = document.getElementById("menuToggle");
    const menu = document.getElementById("menu");
  
    menuToggle.addEventListener("click", () => {
      menu.classList.toggle("oculto");
    });
  });

  document.addEventListener("DOMContentLoaded", () => {
    const confirmarBtn = document.querySelector(".btn-confirmar");
  
    confirmarBtn.addEventListener("click", () => {
      const checkboxes = document.querySelectorAll('input[type="checkbox"][name="horario"]');
      const horariosSeleccionados = Array.from(checkboxes).filter(cb => cb.checked);
  
      if (horariosSeleccionados.length === 0) {
        alert("Por favor, seleccione al menos un horario antes de confirmar.");
        return;
      }
  
      const confirmar = confirm("¿Está seguro de que desea confirmar el/los horario(s) seleccionado(s)?");
  
      if (confirmar) {
       
        alert("¡Horario confirmado exitosamente!");
        
      } else {
     
        alert("No se confirmó ningún horario.");
      }
    });
  });
  