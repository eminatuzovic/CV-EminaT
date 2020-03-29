For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file ContactSet.json:

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

Sample initial data for file Sections_ResumeSet.json:

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
