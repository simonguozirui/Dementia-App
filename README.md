##About
We are team LowKey, four high school students from Toronto and [the Toronto Hacker Club](http://torontohacker.club/).
This is our project at [Hackernest Dementia Hack 2017](http://hackernest.com/dementiahack/). We are in CS4 category and try to help scientists and researchers:

> collecting and having access to ‘real-life’ cognitive and memory processing data
> collecting more accurate and consistent health/environmental data, e.g. medical diagnoses, job, proximity to power plants, etc.
> finding eligible volunteers to participate in research studies/trials

## Inspiration
Doctors and Researchers has faced several problems for Dementia Research

* Not enough consistent and real-life data on the brain activity of Dementia Research
* Limited access to real-life dementia information
* Current research on brain analysis requires patients to go to hospital (CT scanning, etc) with specialties operating and monitoring
* Not enough reference data (environment, etc) to analysis the brain signal data
* Patients, especially the early stage ones,  do not want to show their friends and admit they have Dementia. They would like something less obvious to monitor their brain activity in real-life

## What it does

1. Scan patients' EEG data by using Muse 
2. Transfer Muse data through Bluetooth low energy to an Android App
3. Android App upload the data to our server, add the data into database
4. Researchers and Doctors can use a user interface to access, graph, and download data in .csv in a specific time period they selected.
5. Stream Video to Doctor (didn't get to work because we were underground and we had poor wifi)

## Why it matters

* **Reduce the procedure, technical difficulty, and cost significantly of Dementia Research.** The patients no longer need to come to hospitals and do long and expensive experiments and testing and the doctor can remotely control the patient. Rather, they can simply wear the device and experience normal life while testing. The cost of the research/scanning is only a 300-CAD Muse headband that you can use forever, much cheaper than going to hospitals constantly.
* **Increase the consistency and reliability of the data.** Because the data are collected by uniform hardware and code in real-life environments, rather than different equipment and techniques offered in the hospital, the data are likely to be analyzed with higher accuracy and consistency.
* **Modularity and infinite possibilities.** We provided such a platform that many features based on individual need could be added to. Such as adding a camera to let the patient do memory test remotely, and provide environmental references for unusual brain signal changes. 

## How we built it
###Hardware
We used a Muse headband and a phone camera. We attached (hide) the Muse Headband under a cap so that users don't feel embarrassed wearing the device in public. We also attached a camera on top of the cap to take video footage of the environment around patients when significant changes are detected. We glue gun the entire project and cover the project with [Hackernest](http://hackernest.com/) stickers to make it look polished.  
###Software
We used flask and PostgreSQL on our server. It used Nginx and letsencrypt SSL to help make it a bit more secure (as we are maintaining health data). We also set up an IP camera and set up OpenCV code to stream the video on researchers'/doctors' side. A website is also designed for the researcher/doctor to pull the data from specific time periods of the patient and graph the data.

## What we learned

* Think big about the impact of the hack
* Take time to talk to professionals and learn about their demand before start hacking
* Focus on one major feature of the product and make sure it works well and stably
* Emphasize why it matters in the demo
* Never give up! (we get everything finally working in the last 30 min)

## What's next for WaveBank
We believe our product provided a great platform for researchers and doctors. 

* Researchers could easily perform data mining or machine learning on our platform.
* We can easily integrate other features on this platform modularly, such as doing memory and Stroop test remotely 
* Use service such as box to make our platform HIPAA compliant
* Preferably use the upcoming Muse glasses to make users more comfortable to use such device
