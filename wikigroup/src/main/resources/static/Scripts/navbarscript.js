const toggleBtn = document.querySelector('.toggle-btn');
const sidebar = document.querySelector('.sidebar');

toggleBtn.addEventListener('click', () => {
  sidebar.classList.toggle('active');

  // Cambiar el ícono del botón al abrir/cerrar
  if (sidebar.classList.contains('active')) {
    toggleBtn.innerHTML = '<i class="fas fa-times"></i>'; // Ícono de cerrar
  } else {
    toggleBtn.innerHTML = '<i class="fas fa-bars"></i>'; // Ícono de menú
  }
});