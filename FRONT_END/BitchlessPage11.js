// Scroll animation reveal for gallery items
const galleryItems = document.querySelectorAll('.fade-in');

const scrollObserver = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add('visible');
    }
  });
}, {
  threshold: 0.3
});

galleryItems.forEach(item => {
  scrollObserver.observe(item);
});
