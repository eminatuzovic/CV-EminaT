For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file ContactSet.json:

''' JSON
[
    {
        "ContactID": "101"
    },
    {
        "ContactID": "102"
    }
]
'''

Sample test data for file Sections_ResumeSet.json:

''' JSON
[
    {
        "ContactID": "101",
        "Education": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Experience": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Languages": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Personnal": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Sections_ResumeID": "201",
        "Skills": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Summary": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "ContactID": "102",
        "Education": "XYZ",
        "Experience": "XYZ",
        "Languages": "XYZ",
        "Personnal": "XYZ",
        "Sections_ResumeID": "202",
        "Skills": "XYZ",
        "Summary": "XYZ"
    }
]
'''
