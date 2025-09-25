// Animated title — floating letter effect
const title = document.getElementById("epicTitle");
let original = title.textContent;
title.innerHTML = "";

[...original].forEach((letter, i) => {
  const span = document.createElement("span");
  span.textContent = letter;
  span.style.display = "inline-block";
  span.style.animation = `floatLetter 2s ease ${i * 0.05}s infinite alternate`;
  title.appendChild(span);
});

// Floating animation for heading letters
const style = document.createElement("style");
style.innerHTML = `
  @keyframes floatLetter {
    from { transform: translateY(0); }
    to { transform: translateY(-5px); }
  }
`;
document.head.appendChild(style);

// Scroll-reveal for images
const images = document.querySelectorAll(".animated-image");
const observer = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add("reveal");
    }
  });
}, { threshold: 0.3 });

images.forEach(img => observer.observe(img));
