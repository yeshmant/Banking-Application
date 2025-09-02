// Password visibility toggle
const togglePassword = document.getElementById('togglePassword');
const password = document.getElementById('password');
const toggleIcon = document.getElementById('toggleIcon');

if (togglePassword && password && toggleIcon) {
    togglePassword.addEventListener('click', function () {
        const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
        password.setAttribute('type', type);
        toggleIcon.classList.toggle('fa-eye');
        toggleIcon.classList.toggle('fa-eye-slash');
    });
}

// Quote carousel
const quotes = [
    { text: "An investment in knowledge pays the best interest.", author: "Benjamin Franklin" },
    { text: "The secret to getting ahead is getting started.", author: "Mark Twain" },
    { text: "The best way to predict the future is to create it.", author: "Peter Drucker" },
    { text: "Financial peace isn't the acquisition of stuff. It's learning to live on less than you make.", author: "Dave Ramsey" }
];

let currentQuoteIndex = 0;
const quoteText = document.getElementById('quote-text');
const quoteAuthor = document.getElementById('quote-author');
const quoteContainer = document.getElementById('quote-container');

function changeQuote() {
    if (quoteContainer) {
        quoteContainer.style.opacity = '0';
        
        setTimeout(() => {
            currentQuoteIndex = (currentQuoteIndex + 1) % quotes.length;
            quoteText.textContent = `"${quotes[currentQuoteIndex].text}"`;
            quoteAuthor.textContent = `- ${quotes[currentQuoteIndex].author}`;
            quoteContainer.style.opacity = '1';
        }, 500);
    }
}

setInterval(changeQuote, 6000); // Change quote every 6 seconds
