  // ---- Quiz Data ----
  const QUESTIONS = [
    {
        q: "Which country won the very first FIFA World Cup in 1930?",
        options: ["Brazil", "Uruguay", "Argentina", "Spain"],
        answer: 1,
        explain: "The first FIFA World Cup was held in Uruguay in 1930 in which Uruguay was the winner"
    },
    {
        q: "Who has scored the famous 'Hand of God' ? ",
        options: ["Diego Armando Maradona", "Pele", " Miroslav Klose", "Gabriel Batistuta"],
        answer: 0,
        explain: "In the 1986 year Diego Armando Maradona won his team Argentina the first FIFA World Cup and he famously scored a goal with his hand in a game"
    },
    {
        q: "Which club did Christiano Ronaldo start his career in?",
        options: ["Real Madrid", "Manchester United", "Sporting CP (Lisbon)", "Juventus"],
        answer: 2,
        explain: "Ronaldo started at Sporting CP (Lisbon) in Portugal before Sir Alex Ferguson spotted him in 2003"
    },
    {
        q: "Who has the most assists in the FIFA World Cup history?",
        options: ["Lionel Messi", "Bruno Fernandes", "Dider Drogba", "Mesut Ozil"],
        answer: 0,
        explain: "Messi is the player with the most assists in Football history"
    },
    {
        q: "Which country has always participated in the FIFA World Cup since 1930?",
        options: ["Columbia", "France", "Brazil", "Italy"],
        answer: 2,
        explain: "Brazil has never missed the FIFA World Cup - the only nation with 100% participation"
    },
    {
        q: "Who is the only player to win the Champions League with three different clubs?",
        options: ["Clarence Seedorf", "Zlatan Ibrahimovic", "Cristiano Ronaldo",  "Samuel Eto"],
        answer: 0,
        explain: "Seedorf won with Ajax (1995), Real Madrid (1998), AC Milan (2003, 2007)"
    },
    {
        q: "Which club has the nickname “The Invincibles” in modern football?",
        options: ["Barcelona", "Arsenal", "Chelsea", "Real Madrid"],
        answer: 1,
        explain: "Arsenal (2003-04 season) went the entire Premier League unbeaten under Arsene Wenger — 38 games, 26 wins, 12 draws"
    },
    {
        q: "What makes Zlatan Ibrahimović unique in Champions League history?",
        options: ["Scored for 6 different clubs", "Most assists ever", "Only Swede to win it", "Most red cards"],
        answer: 0,
        explain: "Zlatan scored UCL goals for 6 clubs (Ajax, Juventus, Inter, Barcelona, Milan, PSG)"
    },
    {
        q: "What year did the Premier League officially start?",
        options: ["1989", "2006", "1996", "1992"],
        answer: 3,
        explain: "The English Premier League was founded in 1992, replacing the old First Division. That is why records often separate First Division and Premier League titles", 
    },
    {
        q: "What unique record does Mario Götze hold in World Cup history?", 
        options: ["Youngest final scorer", "Only sub to score a winning goal", "First German golden goal", "First VAR goal"],
        answer: 1,
        explain: "Götze came on as a sub in 2014 Final vs Argentina --> scored in extra time → decided the World Cup as a substitute"
    },
    {   q: "Which defender is famous for scoring goals and has over 100 career goals?",
        options: ["Sergio Ramos", "Paolo Maldini", "Cafu", "Dani Alves"],
        answer: 0,
        explain: "Sergio Ramos, though a center-back, has scored more than 100 goals in his career. Penalties, headers, and clutch goals made him a goal-scoring defender legend"
    },
    {
        q: "Why is the 2005 Champions League Final called the 'Miracle of Istanbul'?",
        options: ["AC Milan missed penalties", "Liverpool came back from 3-0 down", "Gerrard scored a hat-trick", "It was played in heavy rain"],
        answer: 1,
        explain: "In the 2005 UCL Final, Liverpool were 3-0 down to AC Milan at half-time, but they fought back to 3-3 and won on penalties. It's one of football's greatest comebacks"
    },
    {
        q: "Which player is nicknamed The Pharaoh?", 
        options: ["Didier Drogba", "Mohamed Salah", "Riyad Mahrez", "Samuel Etoo"],
        answer: 1,
        explain: "Egyptian superstar Salah earned it because of his national icon status"
    },
    {
        q: "Why was the 1966 World Cup trophy stolen before the tournament?", 
        options: ["For gold value", "By rival fans", "For political protest", "For ransom by a club"],
        answer: 0,
        explain: "The Jules Rimet Trophy was stolen in London and later found by a dog named Pickles"
    },
    {
        q: "Which club is nicknamed Los Blancos?",  
        options: ["Barcelona", "Valencia", "Sevilla", "Real Madrid"],
        answer: 3,
        explain: "Real Madrid wear all-white kits --> nickname Los Blancos (The Whites)"
    }
];

    const SECONDS_PER_Q = 10;

    // ---- State ----
    let order = [];               // question order indices --> shuffle questions
    let idx = 0;                  // current question index in order
    let score = 0;                // points
    let streak = 0;               // correct ✔ streak
    let selected = null;          // option the user clicked for the current question --> 0 -> first option, 1 -> second option, 2 → third option, 3 -> fourth option, null -> nothing selected yet.
    let timerId  = null;          // interval id
    let timeLeft = SECONDS_PER_Q; // time left
    let name = "";                // stores the name of username if provided

    const bestKey = 'quiz_best_score_v1'; // key used in localStorage to save the user’s best score

    // ---- Elements ----
    const screens = {
      start: document.getElementById('screen-start'),
      quiz: document.getElementById('screen-quiz'),
      end: document.getElementById('screen-end')
    };
    const btnStart = document.getElementById('btn-start');
    const btnHow = document.getElementById('btn-how');
    const howto = document.getElementById('howto');
    const nameInput = document.getElementById('name');
    const bestPill = document.getElementById('best-pill');

    const progressPill = document.getElementById('progress-pill');
    const scorePill = document.getElementById('score-pill');
    const streakPill = document.getElementById('streak-pill');
    const timerPill = document.getElementById('timer-pill');
    const progressBar = document.getElementById('progress-bar');

    const qEl = document.getElementById('question');
    const optsEl = document.getElementById('options');
    const expEl = document.getElementById('explain');
    const btnSkip = document.getElementById('btn-skip');
    const btnNext = document.getElementById('btn-next');

    const greetEl = document.getElementById('greet');
    const finalScoreEl = document.getElementById('final-score');
    const finalCorrectEl = document.getElementById('final-correct');
    const finalBestEl = document.getElementById('final-best');
    const reviewEl = document.getElementById('review');
    const btnRestart = document.getElementById('btn-restart');
    const btnHome = document.getElementById('btn-home');

    // Confetti canvas
    const confettiCanvas = document.getElementById('confetti');
    const ctx = confettiCanvas.getContext('2d'); // <canvas> element is a rectangular area in the DOM where you can 
    //                                              draw graphics using JavaScript -> getContext is a method of the 
    //                                              canvas element -> return a drawing context object that provides 
    //                                              the methods and properties to render graphics -> '2d' specifies 
    //                                              the type of context 
    //                                              Draw Shapes             ->  fillRect, arc, beginPath 
    //                                              Apply styles            -> fillStyle, strokeStyle
    //                                              Manipulate pixels       -> getImageData, putImageData)
    //                                              Perform transformations -> rotate, scale, translate

    // ---- Utility ----
    function shuffle(arr){
      for (let i = arr.length - 1; i > 0; i--){ // starts from the last element of the array and goes backwards to the second element.
        const j = Math.floor(Math.random() * (i + 1)); // math.random() generates a decimal number between 0 and 1 -> Multiplying by (i + 1) and flooring it ensures j is an integer in [0, i]
        [arr[i], arr[j]] = [arr[j], arr[i]]; // swaps the element at index i with the element at index j -> This is 
    //                                          destructuring assignment syntax for swapping values without a 
    //                                          temporary variable -> Effect: Each element from the end of the array 
    //                                          is randomly swapped with another element that comes before or at its 
    //                                          position, gradually shuffling the entire array
      }
      return arr; // returns the shuffled array
    }

    function setScreen(which){ // setScreen() -> function switches between (start, quiz, end) screens
    //                            (which) -> tells the function which screen is to be shown (start or quiz or end)  
      Object.values(screens).forEach(s => s.classList.remove('active')); // Object.values(screens) -> gives an array  
    //                                                                      of all the <div> elements (start, quiz, end)
    //                                                                      forEach(...) -> loop through each screen
    //                                                                      classList.remove('active') -> remove the CSS
    //                                                                      class "active" from them -> makes all screens hidden
      screens[which].classList.add('active'); // we decide the screen we want to show (screens[which]) 
    //                                           add "active" class back -> This makes only the chosen screen visible
    }

    function getBest(){                                  // to get the best value from the user
      return Number(localStorage.getItem(bestKey) || 0); // localStorage -> built-in web storage system (key, value pairs)
    //                                                      Number -> localStorage stores everything as strings so Number -> converts the string to a number
    //                                                      getItem(bestKey) -> fetches the value saved under the key bestKey
    }

    function setBest(val){                        // to permanently store the best value (otherwise the best value vanishesh)
      localStorage.setItem(bestKey, String(val)); // localStorage.setItem(key, value) -> saves a value permanently
    //                                               bestKey -> name of the storage slot ('quiz_best_score_v1')
    //                                               string(val) -> makes sure the score is stored as a string
    }

    function updateTopbar(){
      progressPill.textContent = `Question ${idx+1}/${order.length}`;
      scorePill.textContent = `Score: ${score}`;
      streakPill.textContent = `Streak: ${streak}`;
      timerPill.textContent = `⏳ ${timeLeft}s`;
      progressBar.style.width = `${((idx)/order.length)*100}%`; // % fill -> (currentIndex / totalQuestions) * 100
    }

    function speak(msg){ // make the browser speak aloud a given text message (msg) using the built-in Web Speech API
      if ('speechSynthesis' in window){ // speechSynthesis is the global object responsible for text-to-speech
        const u = new SpeechSynthesisUtterance(msg); // SpeechSynthesisUtterance -> new utterance object containing the message to be spoken
        u.rate = 1.1; u.pitch = 1.1; u.volume = 0.4; u.lang = 'en-US'; // u.rate   -> speed of the speech
    //                                                                    u.pitch  -> controls tone of the voice
    //                                                                    u.volume -> controls loudness
    //                                                                    u.lang   -> specifies the language/accent
      }
    }

    function beep(freq=880, duration=0.08){ // custom beep sound generator using the Web Audio API
      const audioCtx = new (window.AudioContext || window.webkitAudioContext)(); // creates an audio context -> basically the "sound engine" for the browser
      const osc  = audioCtx.createOscillator(); // creates an oscillator -> a tone generator -> This will produce a 
    //                                             continuous waveform (sine, square, triangle, etc.)
      const gain = audioCtx.createGain(); // creates a gain node -> volume controller
      osc.type = 'triangle'; // 'triangle' -> smoother than square, sharper than sine. Good for simple “blip” sounds
      osc.frequency.value = freq; // sets the oscillator’s frequency (880)
      osc.connect(gain); gain.connect(audioCtx.destination); // connects oscillator & gain (volume) & speakers
      gain.gain.setValueAtTime(0.001, audioCtx.currentTime); // starts the volume really, really low (0.001)
      gain.gain.exponentialRampToValueAtTime(0.25, audioCtx.currentTime + 0.01); // smoothly increases the volume to 25% over 10ms
      osc.start(); // starts the oscillator -> the beep begins playing

      setTimeout(()=>{ // waits for the beep duration (converted from sec -> ms)
        gain.gain.exponentialRampToValueAtTime(0.0001, audioCtx.currentTime + 0.08); // smooth fade-out over ~80ms
        osc.stop(audioCtx.currentTime + 0.1); // stops the oscillator slightly after the fade-out
        audioCtx.close(); // shuts down the audio context to free resources
                     }, duration*1000);
    }

    // ---- Timer ----
    function startTimer(){
      stopTimer(); // clears the previous setInterval using clearInterval(timerId)
      timeLeft = SECONDS_PER_Q; // resets the countdown back to the default value
      timerPill.classList.remove('pulse'); // at the start of a question -> we want the timer calm, not pulsing
      timerPill.textContent = `⏳ ${timeLeft}s`;
      timerId = setInterval(()=>{
        timeLeft--; // naturally timeLeft goes from 10 to 0 and the time ends for the user to answer that particular question
        
        if (timeLeft <= 3) {
          timerPill.classList.add('pulse'); // visually warns the player: ⚠️ “Hurry up!”
        }

        timerPill.textContent = `⏳ ${Math.max(0,timeLeft)}s`; // makes sure it never displays a negative Number

        if (timeLeft <= 0){
          stopTimer(); // cancels the interval (so it doesn’t keep running at -1...)
          handleTimeout(); // handles the logic -> “you didn’t answer in time”
        }
      }, 1000); // closes the setInterval() function call every second
    }

    function stopTimer(){ 
      if (timerId) // if timerId is not null (meaning an interval is active) -> go inside
        { 
          clearInterval(timerId);  // cancels the setInterval() loop associated with that ID.
          timerId = null; // resets the timerId variable so we know there’s no active timer anymore
        } 
    }

    // ---- Render / Flow ----
    let review = []; // {q, options, correctIndex, pickedIndex}

    function startQuiz(){
      name = nameInput.value.trim(); // stores the name from the user and trims it in case of unnecessary blank spaces
      order = shuffle([...Array(QUESTIONS.length).keys()]); // shuffle() -> randomizes that array order
    //                                                         Array(QUESTIONS.length) -> makes an empty array with the 
    //                                                         length of our QUESTIONS array -> [ , , , , , , , , , , , , ])
    //                                                         keys() -> gives an iterator of indexes -> [0, 1, 2, 3, 4]
      idx = 0; score = 0; streak = 0; selected = null; review = [];
      btnNext.disabled = true; // disables the “Next” button at the start of each question
      setScreen('quiz'); // switches the UI to the “quiz screen"
      renderQuestion(); // loads and displays the current question + its answer options on the screen
      startTimer(); // starts the countdown clock for the current question
    }

    function renderQuestion(){
      const qIndex = order[idx]; // picks the current question’s index in the QUESTIONS array based on shuffled order 
    //                              eg -> order = {2, 5, 3, 4, 0, 1} and idx = 0, qIndex = 2, idx = 1, qIndex = 5...
      const item = QUESTIONS[qIndex]; // fetches the actual question object
    //                              eg -> item = {q: "What is 2+2?", options: ["3","4"], correctIndex: 1}
      qEl.innerHTML = item.q; // displays the question text inside the question element -> "What is 2+2?"
      expEl.classList.remove('show'); // hides the old explanation so the screen is clean again
      expEl.textContent = ''; // clears out any previous "explanation/feedback" from the last question
      optsEl.innerHTML = ''; // clears old answer buttons before rendering the new ones

      item.options.forEach((text, i)=>{ // text = options, i = index
        const opt = document.createElement('button'); // Create a <button>
        opt.className = 'option'; // Give it the CSS class "option" (added css on it in the script57.css file)
        opt.setAttribute('data-idx', i); // useful later for checking which option was clicked
        opt.innerHTML = `<span class="badge">${i+1}</span> <span>${text}</span>`; // shows the option number (i+1, so it starts at 1 instead of 0)
        opt.addEventListener('click', ()=> selectOption(i)); // click -> selects the option (i)
        optsEl.appendChild(opt); // every time the loop runs, it takes one new option button and
        //                          sticks it into the DOM under optsEl
      }); 

      btnNext.disabled = true; // locks the Next button until the player picks an answer
      updateTopbar(); // updates top bar info (like timer, score, progress bar
      document.querySelector('.question-card').style.animation = 'fadeUp .25s ease'; // adds a quick "fade up" animation 
      //                                                                                whenever a new question loads
      
      setTimeout(()=>{ 
        document.querySelector('.question-card').style.animation = 'none'; // resets the animation property on .question-card
      }, 260); // why 260? Because the CSS animation we triggered just before has a duration of 0.25s (250ms)
      //          they add a tiny buffer (10ms) -> so by 260ms, the animation is guaranteed to be finished
    }

    function selectOption(i){ // runs whenever a player clicks an answer option
      if (selected !== null) // if selected is already set, the player has already answered this question
        {
          return; // return stops the function early -> prevents double-click abuse
        }

      selected = i; // record which option player clicked
      stopTimer(); // freeze the countdown clock once an option is chosen
      const qIndex = order[idx]; // fetches the shuffled index for the current question
      const item = QUESTIONS[qIndex]; // the actual question object from QUESTIONS -> contains q, options, answer and explain
      const correct = i === item.answer; // i -> the option index the player clicked 
    //                                      item.answer -> the option index that is actually correct for this question
    //                                      correct -> stores either true or false

      // mark buttons
      [...optsEl.children].forEach((btn, j)=>{ // optsEl.children -> all option buttons, [...] makes them an array so we can forEach
      //                                          forEach((btn, j) => { ... }) -> loops through each option button
        btn.classList.add('disabled'); // every button gets .disabled so they can’t be clicked anymore
        if (j === item.answer) // if this button’s index j matches the correct answer index (item.answer)
          {
            btn.classList.add('correct'); // that button is highlighted with the "correct" class
          }
    });

      const chosenBtn = optsEl.querySelector(`[data-idx="${i}"]`); // find the <button> that has the data-idx attribute equal to i
      if (!correct){
          chosenBtn.classList.add('wrong'); // you chose the wrong answer -> the button you clicked gets a "wrong" CSS class
        }

      // score & streak
      if (correct){ // block handles what happens depending on whether your answer was right or wrong
        beep(1200, .09); // Frequency = 1200 Hz, Duration = 0.09 seconds -> a high-pitched “ding” for correct answers
        streak++; // correct streak increases by 1 obviously
        // award small time bonus: +1 per 3s left
        const bonus = Math.floor(timeLeft / 3); // (bonus for answering quickly)
        score += 10 + bonus; // you always get 10 points for a correct answer and a bonus
      } 

      else{
        beep(220, .09); // Frequency = 220 Hz, Duration = 0.09 seconds -> a low-pitched “ding” for correct answers
        streak = 0; // streak is broken OH Noo
      }

      // explanation
      expEl.textContent = item.explain; // it inserts the explanation text into that explanation box
      expEl.classList.add('show'); // now we show the explanation box -> before this, the explanation was hidden
      updateTopbar(); // calls a function that refreshes the top bar UI (timer, score, streak and progress bar)
      btnNext.disabled = false; // unlocks the “Next Question” button

      review.push({ 
        q: item.q, // the actual question text
        options: item.options, // the answer choices
        correctIndex: item.answer, // the right option’s index
        pickedIndex: i // what you the player chose (i)
      });
    }

    function handleTimeout(){ // what triggers this? Timer hits 0: In startTimer, when timeLeft <= 0, it calls stopTimer(); handleTimeout();
    //                           you click “Skip”: The skip button runs handleTimeout() if you haven’t answered yet
      const qIndex = order[idx]; // order[idx] is the shuffled index of the current question
      const item = QUESTIONS[qIndex]; // item is the actual question object (has q, options, answer, explain)
      [...optsEl.children].forEach((btn, j)=>{ // optsEl.children = all the option buttons
    //                                         // [ ... ] -> turns that live collection into an array so we can forEach
        btn.classList.add('disabled'); // every button gets .disabled (no more clicking)
        if (j === item.answer) 
          {
            btn.classList.add('correct'); // we don’t mark any button .wrong here because no option was chosen—this is a timeout/skip case
          }
      });

      beep(220, .09); streak = 0; selected = -1; // -1 means none picked

      expEl.textContent = 'Time\'s up! ' + item.explain;
      expEl.classList.add('show');
      btnNext.disabled = false; // you’re now allowed to move to the next question
      updateTopbar(); // calls a function that refreshes the top bar UI (timer, score, streak and progress bar)
      review.push({ 
        q: item.q, // the actual question text
        options: item.options, // the answer choices
        correctIndex: item.answer, // the right option’s index
        pickedIndex: -1 // this is how the review screen knows to display “(no answer)” for this question
      });
    }

    
    function next(){
      if (idx < order.length - 1){ // are we still in the middle of the quiz?
        idx++; // if yes, load the next question
        selected = null; // resets the player’s choice before showing the new question
        renderQuestion(); // calls the function that displays the new question -> updates the text of the question,
    //                       displays new answer buttons -> Resets animations -> clears the old explanation
        startTimer(); // starts the countdown for the new question -> important, since every question has its own time
      } 
      
      else{
        finish(); // If no, it means we’re done -> jump to results
      }
    }

    function finish(){ // ends the quiz run, shows the end/results screen, calculates final stats (score, correct 
    //                    count), updates persistent best score if needed, builds the per-question review UI, and 
    //                    triggers a celebration (confetti)
      stopTimer(); // calls the function that clears the question countdown (clearInterval(timerId) and sets timerId = null)
      setScreen('end'); // switches the visible UI to the end/results screen (it removes active from other screens and
    //                     adds active to the 'end' screen element)
      progressBar.style.width = '100%'; // Visually fills the progress bar to 100% so the progress indicator shows completion

      const correctCount = review.filter(r => r.pickedIndex === r.correctIndex).length; // review -> array built 
    //                                   during play (each object: {q, options, correctIndex, pickedIndex})
    //                                   review.filter(...) -> returns an array of only those review entries where                                                             
    //                                   the player’s pickedIndex equals the correctIndex                                                 
    //                                   length -> yields how many were correct — the number of correct answers                                                                                                                                        
      const bestPrev = getBest(); // bestPrev holds the previous high score for comparison
      if (score > bestPrev) 
        {
          setBest(score); // if current score is higher than previous best score ->  setBest writes the number as a string under the bestKey
        }

      greetEl.textContent = name ? `${name}, you scored:` : 'You scored:'; // if name is submitted then show the name 
    //                                                                        during greeting otherwise don’t
      finalScoreEl.textContent = score; // writes the numeric final score into the final score element
      finalCorrectEl.textContent = `${correctCount}/${order.length}`; // hows correct count over total questions (eg -> 7/10)
      finalBestEl.textContent = getBest(); // Displays the best score from storage after possibly updating it above

    // Build review
      reviewEl.innerHTML = ''; // clears previous review DOM content (if any) to avoid duplicates
      review.forEach((r, i)=>{ // for each r (review object) at index i 
        const div = document.createElement('div'); // makes a new container <div> for this question's review entry
        const status = r.pickedIndex === r.correctIndex ? 'correct' : 'wrong'; // determines whether the user got this one right
        div.className = `review-item ${status}`; // assigns classes like "review-item correct" or "review-item wrong"
        const your = r.pickedIndex === -1 ? '(no answer)' : r.options[r.pickedIndex]; // the sentinel used for skips)
    //                                                                                   show "(no answer)".
    //                                                    otherwise, pull the user’s selected option text from r.options
        const right = r.options[r.correctIndex]; // the correct answer text from the options array
        div.innerHTML = `<div class="q">Q${i+1}. ${r.q}</div>
                         <div class="a">Your answer: <b>${your}</b> | Correct: <b>${right}</b></div>`;
        reviewEl.appendChild(div); // built div to the review container in the DOM so it appears on the results page
      });

      launchConfetti(140); // calls the confetti animation function with count = 140
    }

    function backHome(){
      setScreen('start'); // backHome -> sends you back to the start screen
      bestPill.textContent = `Best score: ${getBest()}`; // the only thing to change might be the best score
    }

    // ---- Confetti ----
    function resizeCanvas(){ // adjust the size of the confetti drawing canvas so it always fits the whole browser window
    // confettiCanvas -> an HTML <canvas> element in your web app where confetti is drawn
      confettiCanvas.width = window.innerWidth; // width -> property that sets how wide the canvas drawing area is (in pixels)
    //                                          // window.innerWidth -> gives the current width of the browser window (in pixels), 
    //                                             excluding scrollbars/toolbars
      confettiCanvas.height = window.innerHeight; // height -> property that sets how high the canvas drawing area is (in pixels)
    //                                               window.innerHeight -> gives the current height of the browser window (in pixels), 
    //                                               excluding scrollbars/toolbars 
    }

    window.addEventListener('resize', resizeCanvas); // window.addEventListener -> sets up a listener for a specific 
    //                                                  event on the browser window
    //                                                  'resize' ->  This fires every time the user resizes the browser window                                                            
    resizeCanvas(); // resizeCanvas -> function to run when the resize happens

    function launchConfetti(count=120){ // creates an array of count tiny “confetti pieces”, animates them for a fixed 
    //                                     duration (dur), and draws them to the <canvas> (via the 2D context ctx) using 
    //                                     requestAnimationFrame. It simulates simple physics (position, velocity, gravity, 
    //                                     rotation) and visual styling (size and color).
    //                                     120 -> the number of confetti pieces to spawn
      const pieces = []; // creates an empty array that will hold all the confetti “particles”

      for (let i=0; i<count; i++){ 
        pieces.push({
          x: Math.random() * confettiCanvas.width, // x -> horizontal start position
          y: -20 - Math.random()*confettiCanvas.height*0.3, // vertical start position -> Starts slightly above the screen (-20) 
    //                                                         plus a random offset up to 30% of canvas height
          r: 2 + Math.random()*3, // radius (half-size of the confetti square). Random size between 2px and 5px
          c: `hsl(${Math.floor(Math.random()*360)}, 80%, 60%)`, // color -> Uses HSL (hsl(hue, 80%, 60%)) with a 
    //                                                             random hue between 0–359
          vx: -2 + Math.random()*4, // velocity in horizontal plane. Between -2 and +2 -> Some pieces drift left,
    //                                 some drift right
          vy: 2 + Math.random()*3, // vy -> velocity in Y (downward speed) -> Between 2 and 5 -> They fall downward at 
    //                                different speeds
          a: Math.random()*Math.PI*2,  // a -> angle (rotation) -> Random starting rotation between 0 and 2π radians
          va: -0.2 + Math.random()*0.4 // va -> angular velocity (rotation speed) -> Between -0.2 and +0.2 -> Some 
    //                                    rotate clockwise, others counter-clockwise
        });
      }
      let t = 0; // keeps track of how long the animation has been running (in ms)
      const dur = 2200; // total duration of animation in milliseconds (2.2 seconds)
      const start = performance.now(); // gets the current high-resolution timestamp

      function frame(now){ // function called repeatedly by the browser (requestAnimationFrame)
    //                        now -> the current time when the frame is drawn
        t = now - start; // how long (ms) since confetti started
        ctx.clearRect(0,0,confettiCanvas.width, confettiCanvas.height); // clears the whole canvas each frame to prevent “trails”
        pieces.forEach(p=>{
          p.x += p.vx;  // move horizontally by velocity
          p.y += p.vy;  // move downward by vertical velocity
          p.a += p.va;  // update rotation angle by angular velocity
          p.vy += 0.03; // simulates gravity (pieces accelerate downward)

          ctx.save(); // saves the current canvas state
          ctx.translate(p.x, p.y); // moves canvas “pen” to confetti’s position
          ctx.rotate(p.a); // rotates by current angle
          ctx.fillStyle = p.c; // sets fill color to the piece’s color
          ctx.fillRect(-p.r, -p.r, p.r*2, p.r*2); // draws a rotated square (size 2r × 2r) centered at (0,0)
          ctx.restore(); // restores canvas state to prevent affecting other pieces
        });

        if (t < dur){ // if the elapsed time t is less than duration (2200ms
          requestAnimationFrame(frame); // keep animating by calling requestAnimationFrame(frame) again
        }

        else { // Else (animation finished) 
          ctx.clearRect(0,0,confettiCanvas.width, confettiCanvas.height); // clear the canvas one last time (remove confetti)
        }
      }

      requestAnimationFrame(frame); // starts the first frame of the animation loop -> the browser repeatedly calls frame(now) until duration ends
    }

    // ---- Events ----
    btnStart.addEventListener('click', startQuiz); // btnStart when clicked -> run startQuiz

    btnHow.addEventListener('click', ()=>{ 
      howto.style.display = howto.style.display === 'none' ? 'block' : 'none'; // if display is set at none -> change it to
    //                                           set it to block otherwise set it to none
    });

    btnSkip.addEventListener('click', ()=>{ // if the skip button is clicked then
      if (selected === null) // meaning the player has not chosen an answer yet
        {
          handleTimeout(); // calls the function that handles a time-up scenario
        } 
    });

    btnNext.addEventListener('click', next); // jumps to the next question
    btnRestart.addEventListener('click', startQuiz); // jumps to the quiz screen at the beginning
    btnHome.addEventListener('click', backHome); // jumps to the home screen, i.e, the start screen

    // Keyboard shortcuts
    window.addEventListener('keydown', (e)=>{ // attaches an event listener to the whole browser window -> "keydown" 
    //                                           event fires whenever the user presses any key on the keyboard
      if (screens.quiz.classList.contains('active')){ // checks if that screen is currently visible

        if (e.key === 'Enter'){ // when the enter key is presssed
           if (!btnNext.disabled){ // next button is available -> user has already clicked an option/skip
            next() // jump to the next question
          }; 
          }

        if (selected === null){ // if the user has not clicked an option yet only then
          const num = Number(e.key); // user may enter a number from 1 to 4 (4 options) -> needs to be converted to Number

          if (num >=1 && num <= 4){ // if the options are from 1 to 4

            const btn = optsEl.querySelector(`[data-idx="${num-1}"]`); // key 1 -> data-idx="0" , 
    //                                                                    Key 2 -> data-idx="1" , 
    //                                                                    Key 3 -> data-idx="2" , 
    //                                                                    Key 4 -> data-idx="3"
            if (btn){ // if such a button exists
              btn.click() // simulate a mouse click on it
            };
          }
        }
      }
    });

    // Init
    (function init(){ // IIFE -> Immediately Invoked Function Expression
      bestPill.textContent = `Best score: ${getBest()}`; // update the best score at the end of it all immediately
    })(); // (); right after -> immediately calls it