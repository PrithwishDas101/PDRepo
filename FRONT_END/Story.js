document.querySelectorAll("button[data-next]").forEach(btn => {
  btn.addEventListener("click", () => {
    const current = btn.closest(".slide");
    const next = btn.dataset.next;
    current.classList.remove("visible");
    document.getElementById(next).classList.add("visible");
  });
});
