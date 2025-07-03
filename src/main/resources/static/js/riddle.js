 document.addEventListener('DOMContentLoaded', function() {
    const langSelect = document.getElementById('lang');
    const newRiddleBtn = document.getElementById('newRiddle');
    const questionDiv = document.getElementById('riddle-question');
    const answerDiv = document.getElementById('riddle-answer');
    const timerDiv = document.getElementById('timer');
    const showAnswerBtn = document.getElementById('showAnswer');
    let timer = null;
    let countdown = 30;
    let answerShown = false;

    function resetTimer() {
        clearInterval(timer);
        countdown = 30;
        timerDiv.textContent = countdown;
        answerShown = false;
        if (showAnswerBtn) showAnswerBtn.disabled = false;
    }

    function showAnswer() {
        answerDiv.style.display = 'block';
        answerShown = true;
        if (showAnswerBtn) showAnswerBtn.disabled = true;
        clearInterval(timer);
    }

    function startTimer() {
        timer = setInterval(() => {
            countdown--;
            timerDiv.textContent = countdown;
            if (countdown <= 0) {
                showAnswer();
            }
        }, 1000);
    }

    function fetchRiddle() {
        resetTimer();
        answerDiv.style.display = 'none';
        questionDiv.textContent = '';
        answerDiv.textContent = '';
        fetch(`/api/riddle?lang=${langSelect.value}`)
            .then(res => res.json())
            .then(data => {
                questionDiv.textContent = data.question;
                answerDiv.textContent = data.answer;
                startTimer();
            });
    }

    newRiddleBtn.addEventListener('click', fetchRiddle);
    langSelect.addEventListener('change', fetchRiddle);
    if (showAnswerBtn) showAnswerBtn.addEventListener('click', showAnswer);

    // Load first riddle on page load
    fetchRiddle();
}); 