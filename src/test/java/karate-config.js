function() {
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  return { demoBaseUrl: 'http://jsonplaceholder.typicode.com' };
}