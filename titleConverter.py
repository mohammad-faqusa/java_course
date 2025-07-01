import re
import os

def title_to_filename(title):
    # Lowercase the title
    title = title.lower()
    # Remove all punctuation including periods and parentheses
    title = re.sub(r'[\"\'():\.]', '', title)
    # Replace spaces and slashes with hyphens
    title = re.sub(r'[\s/]+', '-', title)
    # Remove any remaining non-alphanumeric or non-hyphen characters
    title = re.sub(r'[^a-z0-9\-]', '', title)
    return title

# Example usage

current_directory = "section-5-mastering-java-expressions-statements-code-blocks-and-method-overloading"
title = "46. Deep Overview Of Methods In Java For Reusable Code"
filename = title_to_filename(title)

newpath = './' + current_directory + '/' + title
if not os.path.exists(newpath):
    os.makedirs(newpath)

f = open(newpath + "/note.md", "x")

print(filename)
