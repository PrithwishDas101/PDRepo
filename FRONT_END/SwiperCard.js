const swiper = new Swiper('.swiper', {
    navigation: {
            nextEl: '.swiper-button-next',
                prevEl: '.swiper-button-prev',
    },
    slidesPerView: 1,
    spaceBetween: 10,
    loop: true,
    centeredSlides: true,

    breakpoints: {
        320: {
                slidesPerView: 1,
                spaceBetween: 20
        },
        480: {
                slidesPerView: 2,
                spaceBetween: 30
        },
        640: {
                slidesPerView: 3,
                spaceBetween: 40
        }
    }
})