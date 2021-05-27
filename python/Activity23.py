import pytest
@pytest.fixture
def initList():
    ls =list(range(11))
    return ls
def test_sum(initList):
    sum=0
    for i in initList:
        sum+=i
    assert sum==55

