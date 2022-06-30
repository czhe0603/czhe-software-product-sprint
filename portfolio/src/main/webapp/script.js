// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
    const greetings =
        ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];
  
    // Pick a random greeting.
    const greeting = greetings[Math.floor(Math.random() * greetings.length)];
  
    // Add it to the page.
    const greetingContainer = document.getElementById('greeting-container');
    greetingContainer.innerText = greeting;
  }
  
  function addFact(){
    const facts =
          ['I have 2 siblings', 'I live in Shanghai', 'I\'m good at table tennis', 'I love cheesecakes!!!', 'Blue is my favorite color', 'My lucky number is 8'];
  
    // Pick a random greeting.
    const fact = facts[Math.floor(Math.random() * facts.length)];
  
    // Add it to the page.
    const factContainer = document.getElementById('fact-container');
    factContainer.innerText = fact;
  }
  
  async function showServerTime() {
      const responseFromServer = await fetch('/date');
      const textFromResponse = await responseFromServer.text();
    
      const dateContainer = document.getElementById('date-container');
      dateContainer.innerText = textFromResponse;
  }
  
  async function greetingList() {
      const serverResponse = await fetch('/greeting');
      const greetings = await serverResponse.json();
      const greeting = greetings[Math.floor(Math.random()*greetings.length)]; 
      const greetingContainer = document.getElementById('greeting-container');
      greetingContainer.innerText = greeting;
  }
  
  
  async function loadMovies() {
      const serverResponse = await fetch('/list-movies');
      const movies = await serverResponse.json();
      const moviesContainer = document.getElementById('movie-list');
      moviesContainer.innerText = movies;
  }
    