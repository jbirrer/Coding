import requests
from bs4 import BeautifulSoup

URL = 'https://www.monster.com/jobs/search/?q=software&where=miami'
page = requests.get(URL)

soup = BeautifulSoup(page.content, 'html.parser')

results = soup.find(id='ResultsContainer')

job_elems = results.find_all('section', class_='card-content')
