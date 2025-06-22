import re

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
title = '20. Understanding and Using Casting with Numeric Primitive Types in Java'
filename = title_to_filename(title)
print(filename)
