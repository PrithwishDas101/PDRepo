const milkAudio = document.getElementById('milk-audio');
const headings = document.querySelectorAll('h2');

headings.forEach(h => {
  h.addEventListener('click', () => {
    milkAudio.currentTime = 0; // Rewind if already playing
    milkAudio.play();
  });
});