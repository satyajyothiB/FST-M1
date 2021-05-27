import pytest

@pytest.fixture
def wallet():
    return 0

@pytest.mark.parametrize("earned,spent,expected",[(80,10,60),(90,2,48)])
def test_purse(wallet,earned,spent,expected):
    wallet+=earned
    wallet-=spent
    assert wallet==expected

