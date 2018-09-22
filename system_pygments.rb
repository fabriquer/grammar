require 'pygments'

Pygments.start '/usr/local/bin'

# example of registering a missing or additional lexer
Pygments::Lexer.create name: 'Fabrique', aliases: ['fab','fabrique'],
	filenames: ['*.fab'], mimetypes: ['text/fabrique']
