// reveal all the sections on scrolling

// IntersectionObserver: This is a built-in browser API that watches elements on the page and tells you when they enter or leave the viewport (what you see on screen).
// entries: An array of elements being observed. Each entry has info about whether it’s visible.
// e.isIntersecting: True if the element is currently visible on the screen.
// e.target.classList.add('show'): Adds the show class when the element comes into view.
// Every section with .reveal (like About, Projects) will fade/move in smoothly when you scroll to it. That’s why they animate instead of just appearing suddenly.
// threshold: 0.18: The element is considered “visible” when 18% of it is on screen.
// document.querySelectorAll('.reveal').forEach(el=>io.observe(el)): This just says: “Hey IO, watch all elements with the class .reveal for scrolling.”

const io = new IntersectionObserver((entries)=> {
    entries.forEach(e => {if(e.isIntersecting) e.target.classList.add('show')})
}, {threshold: .18});

document.querySelectorAll('.reveal').forEach(el=>io.observe(el));

// smooth anchor to visit old anchors like 
// a[href^="#"]: Selects all <a> tags whose href starts with #. These are anchor links pointing to IDs on the page.
// .addEventListener('click', ...): When you click one of those links, this function runs.
// const id = a.getAttribute('href').toLowerCase(): Grabs the ID the link points to (like #about) and makes it lowercase so it matches the section IDs.
// const el = document.querySelector(id): Finds the element on the page with that ID.
// if(!el) return: If no element is found, do nothing.
// e.preventDefault(): Stops the default jump-to behavior (so it doesn’t instantly snap).
// window.scrollTo({top: el.offsetTop - 20, behavior:'smooth'}): Smoothly scrolls the page to 20px above the element.

document.querySelectorAll('a[href^="#"]').forEach(a=>{
  a.addEventListener('click', (e)=>{
    const id = a.getAttribute('href').toLowerCase(); // convert to lowercase
    const el = document.querySelector(id);
    if(!el) return;
    e.preventDefault();
    window.scrollTo({top: el.offsetTop - 20, behavior:'smooth'});
  });
});


const clickLogo = document.getElementById('clickLogo');

    clickLogo.addEventListener('click', () => {
      clickLogo.classList.add('bounce');
      clickLogo.addEventListener('animationend', () => {
        clickLogo.classList.remove('bounce');
      }, { once: true });
    });

    // reveal on scroll like your other sections
    const microEl = document.querySelector('#interaction');
    if (microEl) {
      const io = new IntersectionObserver((entries) => {
        entries.forEach(e => {
          if(e.isIntersecting) e.target.classList.add('show');
        });
      }, { threshold: 0.2 });
      io.observe(microEl);
    }