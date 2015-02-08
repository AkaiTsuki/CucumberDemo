Feature: Doc String Demo

  Scenario: Blog in Json Format
    Given a json object post with title "Fake" and body
    """
    {
      title: 'fake',
      author: 'John',
      date: '02-12-2015',
      content: 'Some content'
    }
    """
